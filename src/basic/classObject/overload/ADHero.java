package basic.classObject.overload;

import basic.classObject.Hero;

public class ADHero extends Hero{
	/*
	public void attack() {
		// TODO 自动生成的方法存根
		System.out.println(name+"进行了一次攻击 ，但是不确定打中谁了");
	}
	
	public void attack(Hero h1) {
		// TODO 自动生成的方法存根
		System.out.println(name+"对"+h1.name+"进行了一次攻击 ");
	}
	public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }*/
	
	// 可变数量的参数(取代上面三个方法)
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);
 
        }
    }
 
	public static void main(String[] args) {
		ADHero bh = new ADHero();
		bh.name = "赏金猎人";
		
		Hero h1 = new Hero();
		h1.name = "盖伦";
		
		Hero h2 = new Hero();
		h2.name = "提姆";
		
		//bh.attack(h1);
		//bh.attack(h1, h2);
		
		Support sh = new Support();
		sh.name = "厄切尔";
		/*sh.heal();//自身加hp；
		sh.heal(h2);//给提姆加血
		sh.heal(h1,40);//给盖伦加血40
*/		
		sh.heal(10, h1,h2);
	}
}
