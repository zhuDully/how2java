package io_stream.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class SubStream {

	public static void main(String[] args) {
		// 先将源文件读取到内存中
		int eachSize = 100 * 1024;
		File srcFile = new File("c:/LOLFolder/eclipse.txt");
		splitFile(srcFile, eachSize);
	}

	public static void splitFile(File srcFile, int eachSize) {
		// 判断文件是否符合拆分要求
		if (srcFile.length() == 0) {
			throw new RuntimeException("文件不符合拆分要求");
		}
		byte[] fileContent = new byte[(int) srcFile.length()];
		try {
			// 将文件内容读取到内存中
			FileInputStream fis = new FileInputStream(srcFile);
			fis.read(fileContent);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 计算要次要拆分为多少份
		int fileNumber;
		if (fileContent.length % eachSize == 0) {
			fileNumber = fileContent.length / eachSize;
		} else {
			fileNumber = fileContent.length / eachSize + 1;
		}

		for (int i = 0; i < fileNumber; i++) {
			String fileName = srcFile.getName() + "-" + i + ".txt";
			File fi = new File(srcFile.getParent(), fileName);// 在当前文件路径下创建拆分的文件
			byte[] eachContent;

			// 将源文件内容复制到拆分的文件中
			if (i != fileNumber - 1) {
				eachContent = Arrays.copyOfRange(fileContent, eachSize * i, eachSize * (i + 1));
			} else {
				eachContent = Arrays.copyOfRange(fileContent, eachSize * i, fileContent.length);
			}

			try {
				FileOutputStream fos = new FileOutputStream(fi);
				fos.write(eachContent);
				fos.close();
				System.out.printf("输出子文件 %s,其大小是 %d,每个的大小是%d\n", fi.getAbsoluteFile(), fi.length(), eachContent.length);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}
}
