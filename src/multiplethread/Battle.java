package multiplethread;

import charactor.Hero;
/**
 * 类Battle，实现Runnable接口
 * 借助一个线程对象的start()方法，才会启动一个新的线程 
 * @author zhu_dully
 *
 */
public class Battle implements Runnable {
	private Hero h1;
	private Hero h2;

	public Battle(Hero h1, Hero h2) {
		this.h1 = h1;
		this.h2 = h2;
	}

	public void run() {
		while (!h2.isDead()) {
			h1.attackHero(h2);
		}
	}
}
