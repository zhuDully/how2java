package basic.date;
 
//
import java.util.Date;
 
public class TestDate {
 
    public static void main(String[] args) {
 
        // ��ǰʱ��
        Date d1 = new Date();
        System.out.println("��ǰʱ��:");
        System.out.println(d1);
        System.out.println();
        // ��1970��1��1�� ����8��0��0�� ��ʼ�����ĺ�����
        Date d2 = new Date(5000);
        System.out.println("��1970��1��1�� ����8��0��0�� ��ʼ������5���ʱ��");
        System.out.println(d2);
        
 
    }
}