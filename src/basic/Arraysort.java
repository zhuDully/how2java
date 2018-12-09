package basic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 对复合数据类型的数据的排序
 　　函数原型：  (1)public static<T> void sort(T[] a，Comparator c)  
 					根据指定比较器产生的顺序对指定对象数组进行排序。
　　　　　　　　(2)public static<T> void sort(T[] a，int fromIndex，int toIndex，Comparator c)  
					根据指定比较器产生的顺序对指定对象数组的指定范围进行排序。　
　　说明：这个两个排序算法是“经过调优的合并排序”算法。
 * @author zhu_dully
 *
 */
public class Arraysort {
	Point[] arr;

	Arraysort() {
		arr = new Point[4]; // 定义对象数组arr，并分配存储的空间
		for (int i = 0; i < 4; i++)
			arr[i] = new Point();
	}

	public static void main(String[] args) {

		Arraysort sort = new Arraysort();
		sort.arr[0].x = 2;
		sort.arr[0].y = 1; // 初始化，对象数组中的数据
		
		sort.arr[1].x = 2;
		sort.arr[1].y = 2;
		
		sort.arr[2].x = 1;
		sort.arr[2].y = 2;
		
		sort.arr[3].x = 0;
		sort.arr[3].y = 1;

		Arrays.sort(sort.arr, new MyComprator()); // 使用指定的排序器，进行排序
		for (int i = 0; i < 4; i++) // 输出排序结果
			System.out.println("(" + sort.arr[i].x + "," + sort.arr[i].y + ")");
	}
}

class Point {
	int x;
	int y;
}

// 比较器，x坐标从小到大排序；x相同时，按照y从小到大排序(看做在第一象限的排序)
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