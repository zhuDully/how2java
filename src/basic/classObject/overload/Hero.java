package basic.classObject.overload;

public abstract class Hero {
	 
    public abstract void attack();
      
    public static void main(String[] args) {
 
        //����������ʹ���ⲿ�ľֲ�����damage ��������Ϊfinal
    	final int damage = 5;
         
        //����ʹ�ñ�����AnonymousHero��ģ����������������Ի���
         
        //��ʵ�ϵ������࣬����������������һ��damage���ԣ�����ʹ�ù��췽����ʼ�������Ե�ֵ
        //��attack��ʹ�õ�damage������ʹ�õ�������ڲ�damage�������ⲿdamage
         
        //�����ⲿ���Բ���Ҫ����Ϊfinal
        //��ô��attack���޸�damage��ֵ���ͻᱻ��ʾΪ�޸����ⲿ����damage��ֵ
         
        //�����������ǲ�ͬ�ı������ǲ������޸��ⲿ����damage��
        //����Ϊ�˱�������󵼣��ⲿ��damage��������Ϊfinal,"����ȥ"�Ͳ����޸���
        class AnonymousHero extends Hero{
            int damage;
            public AnonymousHero(int damage){
                this.damage = damage;
            }
            public void attack() {
                damage = 10;
                System.out.printf("�µĽ����ֶΣ����%d���˺�",this.damage );
            }
        }
         
        Hero h = new AnonymousHero(damage);
         
    }
      
}    
