package basic.date;

import java.util.Date;

public class TestDate2 {
	public static void main(String[] args) {
		// ע�⣺��java.util.Date;
		// ���� java.sql.Date�������Ǹ����ݿ���ʵ�ʱ��ʹ�õ�
		Date now = new Date();
		// ��ӡ��ǰʱ��
		System.out.println("��ǰʱ��:" + now.toString());
		// getTime() �õ�һ��long�͵�����
		// ����������� 1970.1.1 08:00:00:000��ÿ����һ���룬����1
		System.out.println("��ǰʱ��getTime()���ص�ֵ�ǣ�" + now.getTime());

		Date zero = new Date(0);
		System.out.println("��0��Ϊ���췽�����õ���������:" + zero);

		// ��ǰ���ڵĺ�����
		System.out.println("Date.getTime() \t\t\t����ֵ: " + now.getTime());
		// ͨ��System.currentTimeMillis()��ȡ��ǰ���ڵĺ�����
		System.out.println("System.currentTimeMillis() \t����ֵ: " + System.currentTimeMillis());

	}
}
