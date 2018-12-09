package basic;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//声明一个数组
		int [] a;
		//创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];
        int[] b = new int[5]; //声明的同时，指向一个数组
        
        /*
         * 首先创建一个长度是5的数组
			然后给数组的每一位赋予随机整数
			通过for循环，遍历数组，找出最小的一个值出来
         */
        for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
        
        System.out.println("原排序： ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
        System.out.println();
        Arrays.sort(a);
        System.out.println("排序后： ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
        System.out.println();
        System.out.println("本练习的目的是，找出最小的一个值: " + a[0]);
       /*调用 Arrays类进行数组排序
        * 说明：(1)Arrays类中的sort()使用的是“经过调优的快速排序法”;
　　　　　　(2)比如int[]，double[]，char[]等基数据类型的数组，
				Arrays类之只是提供了默认的升序排列，没有提供相应的降序排列方法。
　　　　　　(3)要对基础类型的数组进行降序排序，需要将这些数组转化为对应的封装类数组，
			如Integer[]，Double[]，Character[]等，对这些类数组进行排序。(
			其实还不如先进行升序排序，自己在转为降序)。
			
		用默认的升序对数组排序
　　 	函数原型：static void sort(int[] a)   
					对指定的 int 型数组按数字升序进行排序。
　　　　　　　	static void sort(int[] a, int fromIndex, int toIndex)  
					对指定 int 型数组的指定范围按数字升序进行排序。　
        * */
        
        
	}
}
