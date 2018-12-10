package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import charactor.Hero;

public class TestCollection2 {
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
		//Collections.sort(heros, c);
		/*把比较器-Comparator 章节中的代码，使用引用静态方法的方式来实现
		Collections.sort(heros, TestCollection2::testHero);*/
		
		/*引用容器中的对象的方法
		Collections.sort(heros, new Hero()::compareHero);*/
		
		
		System.out.println("按照血量排序后的集合：");
		System.out.println(heros);
		
	}
	
	/**引用静态方法*/
	public static int testHero(Hero h1, Hero h2) {
        return (int)(h1.hp -  h2.hp);
    }
}