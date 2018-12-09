package basic.classObject;

/**
继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
* @author zhu_dully
 *
 */
public class Armor extends Item{
	int ac; //攻击力
	
	public static void main(String[] args) {
		/*
		 * 实例化出两件护甲
			名称 价格 护甲等级
			布甲 300 15
			锁子甲 500 40
		 */
		Armor buJia = new Armor();
		buJia.ac = 15; //ac属性在类Weapon中新设计的
        
		buJia.name = "布甲 ";//name属性，是从Item中继承来的，就不需要重复设计了
		buJia.price = 300;
		
		Armor suoZijia = new Armor();
		buJia.ac = 40; //ac属性在类Weapon中新设计的
        
		buJia.name = "锁子甲 ";//name属性，是从Item中继承来的，就不需要重复设计了
		buJia.price = 500;
	}
}
