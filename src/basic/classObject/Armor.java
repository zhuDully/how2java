package basic.classObject;

/**
�̳�Item�࣬���Ҷ����ṩһ������ac: ���׵ȼ� int����
* @author zhu_dully
 *
 */
public class Armor extends Item{
	int ac; //������
	
	public static void main(String[] args) {
		/*
		 * ʵ��������������
			���� �۸� ���׵ȼ�
			���� 300 15
			���Ӽ� 500 40
		 */
		Armor buJia = new Armor();
		buJia.ac = 15; //ac��������Weapon������Ƶ�
        
		buJia.name = "���� ";//name���ԣ��Ǵ�Item�м̳����ģ��Ͳ���Ҫ�ظ������
		buJia.price = 300;
		
		Armor suoZijia = new Armor();
		buJia.ac = 40; //ac��������Weapon������Ƶ�
        
		buJia.name = "���Ӽ� ";//name���ԣ��Ǵ�Item�м̳����ģ��Ͳ���Ҫ�ظ������
		buJia.price = 500;
	}
}
