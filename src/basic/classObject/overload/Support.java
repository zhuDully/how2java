package basic.classObject.overload;

import basic.classObject.Hero;

/**
 * ���һ����Support (����Ӣ��)�̳�Hero���ṩһ��heal(����)����
��Support��heal������������
heal() 
heal(Hero h) //Ϊָ����Ӣ�ۼ�Ѫ
heal(Hero h, int hp) //Ϊָ����Ӣ�ۼ���hp��Ѫ
 * @author zhu_dully
 *
 */
public class Support extends Hero{
	public void heal() {
		// TODO �Զ����ɵķ������
		this.hp += 50;
	}
	
	public void heal(Hero h) {
		// TODO �Զ����ɵķ������
		h.hp += 60;
		System.out.println("1��"+h.name+"��60��hp��");
	}
	
	public void heal(Hero h, int hp) {
		// TODO �Զ����ɵķ������
		h.hp += hp;
		System.out.println("2��"+h.name+"��"+hp+"��hp��");
	}
	
	//���뱨���ɱ��������Ӧ����Ϊ�����б�����һ��  
	public void heal(int hp, Hero... h) {
		Hero hero;
		for (int i = 0; i < h.length; i++) {
			hero = h[i];
			hero.hp += hp;
			System.out.println("��"+hero.name+"��"+hp+"��hp��");
		}
	}
	public static void main(String[] args) {
		
		
		
	}
}
