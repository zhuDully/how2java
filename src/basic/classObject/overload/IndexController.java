package basic.classObject.overload;

 class Hero1 {
    private String name;
    protected float hp;
         
    public static void battleWin() {
        System.out.println("���Ǹ�����෽��");
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
 class ADHero1 extends Hero1{
    public static void battleWin() {
        System.out.println("����ADHero��battleWin()���෽��");
    }
}
/**
 * ����
 * @author Chen
 * ����д���ƣ���������д�����า�Ǹ���Ķ��󷽷�
 * ���أ��������า�Ǹ�����෽��
 */
public class IndexController {
    /**
     * Hero h =new ADHero();
     * h.battleWin();           //battleWin��һ���෽��
     * h�Ǹ������͵�����
     * ����ָ��һ���������
     * h.battleWin(); ����ø���ķ�������������ķ�����answer:�����˸�����෽��
     * ֻ�С�h2���������͵����ã�ָ��һ��������󡱵�������Ż�������౾����෽��
     */
    public static void main(String[] args) {
        Hero1 h = new ADHero1();
        ADHero1 h2 = new ADHero1();
        h.battleWin();
        h2.battleWin();
    }
}
/**
 * ��̬�������ᱻ����
 */