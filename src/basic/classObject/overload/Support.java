package basic.classObject.overload;

import basic.classObject.Hero;

/**
 * 设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
对Support的heal方法进行重载
heal() 
heal(Hero h) //为指定的英雄加血
heal(Hero h, int hp) //为指定的英雄加了hp的血
 * @author zhu_dully
 *
 */
public class Support extends Hero{
	public void heal() {
		// TODO 自动生成的方法存根
		this.hp += 50;
	}
	
	public void heal(Hero h) {
		// TODO 自动生成的方法存根
		h.hp += 60;
		System.out.println("1给"+h.name+"加60的hp；");
	}
	
	public void heal(Hero h, int hp) {
		// TODO 自动生成的方法存根
		h.hp += hp;
		System.out.println("2给"+h.name+"加"+hp+"的hp；");
	}
	
	//编译报错，可变参数类型应该作为参数列表的最后一项  
	public void heal(int hp, Hero... h) {
		Hero hero;
		for (int i = 0; i < h.length; i++) {
			hero = h[i];
			hero.hp += hp;
			System.out.println("给"+hero.name+"加"+hp+"的hp；");
		}
	}
	public static void main(String[] args) {
		
		
		
	}
}
