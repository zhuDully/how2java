package basic.classObject.overload;

import basic.classObject.Hero;

public class ADHero extends Hero{
	/*
	public void attack() {
		// TODO �Զ����ɵķ������
		System.out.println(name+"������һ�ι��� �����ǲ�ȷ������˭��");
	}
	
	public void attack(Hero h1) {
		// TODO �Զ����ɵķ������
		System.out.println(name+"��"+h1.name+"������һ�ι��� ");
	}
	public void attack(Hero h1, Hero h2) {
        System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
    }*/
	
	// �ɱ������Ĳ���(ȡ��������������)
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " ������ " + heros[i].name);
 
        }
    }
 
	public static void main(String[] args) {
		ADHero bh = new ADHero();
		bh.name = "�ͽ�����";
		
		Hero h1 = new Hero();
		h1.name = "����";
		
		Hero h2 = new Hero();
		h2.name = "��ķ";
		
		//bh.attack(h1);
		//bh.attack(h1, h2);
		
		Support sh = new Support();
		sh.name = "���ж�";
		/*sh.heal();//�����hp��
		sh.heal(h2);//����ķ��Ѫ
		sh.heal(h1,40);//�����׼�Ѫ40
*/		
		sh.heal(10, h1,h2);
	}
}
