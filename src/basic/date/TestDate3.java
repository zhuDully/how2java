package basic.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate3 {
	 public static void main(String[] args) {
	        //y ������
	        //M ������
	        //d ������
	        //H ����24���Ƶ�Сʱ
	        //h ����12���Ƶ�Сʱ
	        //m �������
	        //s ������
	        //S �������
	        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
	        Date d= new Date();
	        String str = sdf.format(d);
	        System.out.println("��ǰʱ��ͨ�� yyyy-MM-dd HH:mm:ss SSS ��ʽ��������: "+str);
	         
	        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
	        Date d1= new Date();
	        String str1 = sdf1.format(d1);
	        System.out.println("��ǰʱ��ͨ�� yyyy-MM-dd ��ʽ��������: "+str1);
	         
	    }
}
