package basic.classObject;

/**
武器类Weapon（继承类Item）
Weapon自己没有设计name和price,但是通过继承Item类，也具备了name和price属性	
 * @author zhu_dully
 *
 */
public class Weapon extends Item{
	int damage; //攻击力
	
	public static void main(String[] args) {
		Weapon infinityEdge = new Weapon();
		infinityEdge.damage = 65; //damage属性在类Weapon中新设计的
        
        infinityEdge.name = "无尽之刃";//name属性，是从Item中继承来的，就不需要重复设计了
        infinityEdge.price = 3600;
	}
}
