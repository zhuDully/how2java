package basic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * �Ը����������͵����ݵ�����
 ��������ԭ�ͣ�  (1)public static<T> void sort(T[] a��Comparator c)  
 					����ָ���Ƚ���������˳���ָ�����������������
����������������(2)public static<T> void sort(T[] a��int fromIndex��int toIndex��Comparator c)  
					����ָ���Ƚ���������˳���ָ�����������ָ����Χ�������򡣡�
����˵����������������㷨�ǡ��������ŵĺϲ������㷨��
 * @author zhu_dully
 *
 */
public class Arraysort {
	Point[] arr;

	Arraysort() {
		arr = new Point[4]; // �����������arr��������洢�Ŀռ�
		for (int i = 0; i < 4; i++)
			arr[i] = new Point();
	}

	public static void main(String[] args) {

		Arraysort sort = new Arraysort();
		sort.arr[0].x = 2;
		sort.arr[0].y = 1; // ��ʼ�������������е�����
		
		sort.arr[1].x = 2;
		sort.arr[1].y = 2;
		
		sort.arr[2].x = 1;
		sort.arr[2].y = 2;
		
		sort.arr[3].x = 0;
		sort.arr[3].y = 1;

		Arrays.sort(sort.arr, new MyComprator()); // ʹ��ָ��������������������
		for (int i = 0; i < 4; i++) // ���������
			System.out.println("(" + sort.arr[i].x + "," + sort.arr[i].y + ")");
	}
}

class Point {
	int x;
	int y;
}

// �Ƚ�����x�����С��������x��ͬʱ������y��С��������(�����ڵ�һ���޵�����)
class MyComprator implements Comparator {
	public int compare(Object arg0, Object arg1) {
		Point t1 = (Point) arg0;
		Point t2 = (Point) arg1;
		if (t1.x != t2.x)
			return t1.x > t2.x ? 1 : -1;
		else
			return t1.y > t2.y ? 1 : -1;
	}
}