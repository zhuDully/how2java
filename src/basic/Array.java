package basic;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//����һ������
		int [] a;
		//����һ��������5�����飬����ʹ������aָ�������
        a = new int[5];
        int[] b = new int[5]; //������ͬʱ��ָ��һ������
        
        /*
         * ���ȴ���һ��������5������
			Ȼ��������ÿһλ�����������
			ͨ��forѭ�����������飬�ҳ���С��һ��ֵ����
         */
        for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
        
        System.out.println("ԭ���� ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
        System.out.println();
        Arrays.sort(a);
        System.out.println("����� ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
        System.out.println();
        System.out.println("����ϰ��Ŀ���ǣ��ҳ���С��һ��ֵ: " + a[0]);
       /*���� Arrays�������������
        * ˵����(1)Arrays���е�sort()ʹ�õ��ǡ��������ŵĿ������򷨡�;
������������(2)����int[]��double[]��char[]�Ȼ��������͵����飬
				Arrays��ֻ֮���ṩ��Ĭ�ϵ��������У�û���ṩ��Ӧ�Ľ������з�����
������������(3)Ҫ�Ի������͵�������н���������Ҫ����Щ����ת��Ϊ��Ӧ�ķ�װ�����飬
			��Integer[]��Double[]��Character[]�ȣ�����Щ�������������(
			��ʵ�������Ƚ������������Լ���תΪ����)��
			
		��Ĭ�ϵ��������������
���� 	����ԭ�ͣ�static void sort(int[] a)   
					��ָ���� int �����鰴���������������
��������������	static void sort(int[] a, int fromIndex, int toIndex)  
					��ָ�� int �������ָ����Χ����������������򡣡�
        * */
        
        
	}
}
