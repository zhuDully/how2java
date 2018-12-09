package io_stream.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MurgeFile {
	public static void main(String[] args) {
		murgeFile("c:/LOLFolder/", "eclipse.txt");
	}

	public static void murgeFile(String folder, String fileName) {
		try {
			File desFile = new File(folder, fileName);
			FileOutputStream fos = new FileOutputStream(desFile);
			int index = 0;

			// 读取每一个子文件
			while (true) {
				//获取每个子文件的文件流
				File eachFile = new File(folder, fileName + "-" + index++ +".txt");
				if (!eachFile.exists()) {
					break;
				}
				// 将一个文件读取到内存中
				FileInputStream fis = new FileInputStream(eachFile);
				byte[] eachContent = new byte[(int) eachFile.length()];
				fis.read(eachContent);
				fis.close();

				//将输入流的数据写入输出流中
				fos.write(eachContent);
				fos.flush();
				System.out.printf("把子文件 %s写出到目标文件 中", eachFile);
				System.out.println();
			}

			fos.close();
			System.out.printf("最后目标文件的大小：%d字节：", desFile.length());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
