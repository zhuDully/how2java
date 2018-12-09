package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import charactor.Hero;
import charactor.HeroChecker;

public class Lambda_Demo1 {
	public static void main(String[] args) {
		Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        //初始化herolist的
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        
       /* System.out.println("筛选出 hp>100 && damange<50的英雄");
        filter(heros);//for循环*/    
        
      /*  System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return (h.hp>100 && h.damage<50);
            }
        };
        filter(heros, checker);*/
        
        /*System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        filter(heros,h->h.hp>100 && h.damage<50);*/
        
        /*System.out.println("直接引用静态方法");
        filter(heros, Lambda_Demo1::testHero);*/
        
        /*System.out.println("使用引用对象方法  的过滤结果：");
        filter(heros, new Lambda_Demo1()::testHero1);*/
        
       /* System.out.println("在Lambda表达式中调用容器中的对象Hero的方法matched");
        filter(heros, h -> h.matched());*/
        
        System.out.println("matched恰好就是容器中的对象Hero的方法，那就可以进一步改写为");
        filter(heros, Hero::matched);
	}
	
	/**普通方法：
	 * 在for循环遍历中进行条件判断，筛选出满足条件的数据*/
	private static void filter(List<Hero> heros) {
        for (Hero hero : heros) {
            if(hero.hp>100 && hero.damage<50)
                System.out.print(hero);
        }
    }
	
	/**匿名类方式:
	 * 通过匿名类的方式，实现这个接口，
	 * 接着调用filter，传递这个checker进去进行判断*/
	private static void filter(List<Hero> heros,HeroChecker checker) {
        for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
    }
	
	/**引用静态方法*/
	public static boolean testHero(Hero h) {
        return h.hp>100 && h.damage<50;
    }
	
	public boolean testHero1(Hero h) {
        return h.hp>100 && h.damage<50;
    }
}
