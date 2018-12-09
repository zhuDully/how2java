package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import charactor.Hero;

public class TestCollection {
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<Hero>();

		for (int i = 0; i < 10; i++) {
			// 通过随机值实例化hero的hp和damage
			heros.add(new Hero("hero " + i, r.nextInt(100), r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);

		// 直接调用sort会出现编译错误，因为Hero有各种属性
		// 到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
		// Collections.sort(heros);

		// 引入Comparator，指定比较的算法
		Comparator<Hero> c = new Comparator<Hero>() {
			@Override
			public int compare(Hero h1, Hero h2) {
				// 按照hp进行排序
				if (h1.hp >= h2.hp)
					return 1; // 正数表示h1比h2要大
				else
					return -1;
			}
		};
		// 1,把外面的壳子去掉
		// 只保留方法参数和方法体
		// 参数和方法体之间加上符号 ->
		Comparator<Hero> c1 = (Hero i1, Hero i2) -> {
			// 实现倒排序之关键
			// if(i1<i2)
			// return 1;
			// else
			// return -1;
			return (int) (i2.hp - i1.hp); // 简单粗暴，赞~
		};
		// 2,把return和{}去掉
		Comparator<Hero> c2 = (Hero i1, Hero i2) -> (int) (i2.hp - i1.hp);

		// 3,把 参数类型和圆括号去掉(只有一个参数的时候，才可以去掉圆括号)
		Comparator<Hero> c3 = (i1, i2) -> (int) (i2.hp - i1.hp);

		// 4,把c3作为参数传递进去
		//Collections.sort(heros, c3);

		// 5,直接把表达式传递进去
		Collections.sort(heros, (i1, i2) -> (int) (i2.hp - i1.hp));

		//Collections.sort(heros, c);// 传入一个匿名内部类对象

		System.out.println("按照血量排序后的集合：");
		System.out.println(heros);
	}
}