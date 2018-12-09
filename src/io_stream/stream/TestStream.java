package io_stream.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**

 */
public class TestStream {

	public static void main(String[] args) {
		try {
			File f = new File("c:/LOLFolder/lol.txt");// 创建基于文件的输入流
			File f2 = new File("c:/LOLFolder/xyz/lol.txt");// 创建基于文件的输入流

			// 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
			/* InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。 FileInputStream
			 * 是InputStream子类，以FileInputStream 为例进行文件读取*/
			FileInputStream fis = new FileInputStream(f);

			// 创建字节数组，其长度就是文件的长度
			byte[] all = new byte[(int) f.length()];
			// 以字节流的形式读取文件所有内容
			fis.read(all);
			for (byte b : all) {
				// 打印出来是65 66
				System.out.println(b);
			}
			// 每次使用完流，都应该进行关闭
			fis.close();

			// 输出流
			/*OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
			FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据*/
			//f = f2;
			FileOutputStream out = new FileOutputStream(f);
			

			// 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };
 
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
