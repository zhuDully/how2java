package basic.classObject;

public class Hero {
	//��Ա����
	public String name;//
	public float hp;//Ѫ��
	float armor;//����
	int moveSpeed;//�ƶ��ٶ�
	
	 //�вεĹ��췽��
    //Ĭ�ϵ��޲εĹ��췽����ʧЧ��
    public Hero(String heroname){ 
        name = heroname;
    }
	
	public Hero() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		new Hero();//����һ�����󣬵�Ŀǰ�ö���û����
		
		Hero h = new Hero();//ʹ��һ��������ָ���������
	}
	
}
