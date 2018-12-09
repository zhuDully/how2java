package io_stream.file;

import java.io.File;
/**
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
遍历这个目录下所有的文件(不用遍历子目录)
找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 * @author zhu_dully
 *
 */
public class Test4 {
	static long min = 3598954, max = -1;
	static String maxName = "";
	static String minName = "";

	public static void main(String[] args) {
		System.out.println(getMaxAndMin("C:/XMPCache"));
	}

	public static String getMaxAndMin(String path) {
		File f1 = new File(path);
		// 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
		File[] list = f1.listFiles();
		System.out.println("当前文件夹下的所有文件:"+list.length);
		if (list != null && list.length != 0) {
			for (int i = 0; i < list.length; ++i) {

				// 拿到最大
				if (!list[i].isDirectory()) {//是否是文件夹
					if (list[i].length() > max) {//文件长度是否大于max
						max = list[i].length();
						maxName = list[i].getAbsolutePath();

					}
				} else {
					System.out.println("当前正在遍历" + list[i].getAbsolutePath());
					getMaxAndMin(list[i].getAbsolutePath());

				}

				// 拿到最小
				if (!list[i].isDirectory()) {
					if (list[i].length() < min && list[i].length() != 0) {
						min = list[i].length();
						minName = list[i].getAbsolutePath();
					}
				} else {
					getMaxAndMin(list[i].getAbsolutePath());
				}
			}
		}
		return "最大的文件是" + maxName + ",其大小是" + max + "个字节" + "\n" + "最小的文件是" + minName + ",其大小是" + min + "个字节";
	}
}
