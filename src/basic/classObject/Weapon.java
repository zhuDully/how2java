package basic.classObject;

/**
������Weapon���̳���Item��
Weapon�Լ�û�����name��price,����ͨ���̳�Item�࣬Ҳ�߱���name��price����	
 * @author zhu_dully
 *
 */
public class Weapon extends Item{
	int damage; //������
	
	public static void main(String[] args) {
		Weapon infinityEdge = new Weapon();
		infinityEdge.damage = 65; //damage��������Weapon������Ƶ�
        
        infinityEdge.name = "�޾�֮��";//name���ԣ��Ǵ�Item�м̳����ģ��Ͳ���Ҫ�ظ������
        infinityEdge.price = 3600;
	}
}
