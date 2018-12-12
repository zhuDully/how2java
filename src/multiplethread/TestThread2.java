package multiplethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 3通过Callable和FutureTask创建线程 
 * 	a. 创建Callable接口的实现类，并实现call()方法；     
 * 	b.创建Callable实现类的实例，使用FutureTask类来包装Callable对象，该FutureTask对象封装了该Callback对象的call()方法的返回值；
 *  c. 使用FutureTask对象作为Thread对象的target创建并启动新线程；     
 *  d.调用FutureTask对象的get()方法来获得子线程执行结束后的返回值。
 */
public class TestThread2 implements Callable<Integer> {
	public static void main(String[] args) {
		TestThread2 ctt = new TestThread2();
		FutureTask<Integer> ft = new FutureTask<Integer>(ctt);
		// Thread thread = new Thread(ft,"有返回值的线程");
		// thread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " 的循环变量i的值" + i);
			if (i == 20) {
				new Thread(ft, "有返回值的线程").start();
			}
		}
		try {
			System.out.println("子线程的返回值：" + ft.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Integer call() throws Exception {
		int i = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return i;
	}

}
