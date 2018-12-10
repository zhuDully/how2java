package lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class TestCollection3 {
	public static void main(String[] args) {
		List<Integer> l;
		/*l = new ArrayList<>();
		insertFirst(l, "ArrayList");

		l = new LinkedList<>();
		insertFirst(l, "LinkedList");*/

		/*
		 * 把比较ArrayList和LinkedList的区别这段代码，改造成引用构造器的模式。 
		 * 	insertFirst(ArrayList::new, "ArrayList"); 
		 * 	insertFirst(LinkedList::new, "LinkedList");
		 */
		/* 引用构造器 */
		Supplier<List> arrayList = new Supplier<List>() {
			public List get() {
				return new ArrayList();
			}
		};
		
		
		insertFirst(ArrayList::new, "ArrayList");
		insertFirst(LinkedList::new, "LinkedList");

	}

	private static void insertFirst(Supplier<List> s, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        List list = s.get();
        for (int i = 0; i < total; i++) {
            list.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("lanbda：在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }

	private static void insertFirst(List<Integer> l, String type) {
		int total = 1000 * 100;
		final int number = 5;
		long start = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			l.add(0, number);
		}
		long end = System.currentTimeMillis();
		System.out.printf("传统：在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
	}
	
	
}
