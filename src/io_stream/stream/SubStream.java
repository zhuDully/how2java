package io_stream.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class SubStream {

	public static void main(String[] args) {
		// �Ƚ�Դ�ļ���ȡ���ڴ���
		int eachSize = 100 * 1024;
		File srcFile = new File("c:/LOLFolder/eclipse.txt");
		splitFile(srcFile, eachSize);
	}

	public static void splitFile(File srcFile, int eachSize) {
		// �ж��ļ��Ƿ���ϲ��Ҫ��
		if (srcFile.length() == 0) {
			throw new RuntimeException("�ļ������ϲ��Ҫ��");
		}
		byte[] fileContent = new byte[(int) srcFile.length()];
		try {
			// ���ļ����ݶ�ȡ���ڴ���
			FileInputStream fis = new FileInputStream(srcFile);
			fis.read(fileContent);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ����Ҫ��Ҫ���Ϊ���ٷ�
		int fileNumber;
		if (fileContent.length % eachSize == 0) {
			fileNumber = fileContent.length / eachSize;
		} else {
			fileNumber = fileContent.length / eachSize + 1;
		}

		for (int i = 0; i < fileNumber; i++) {
			String fileName = srcFile.getName() + "-" + i + ".txt";
			File fi = new File(srcFile.getParent(), fileName);// �ڵ�ǰ�ļ�·���´�����ֵ��ļ�
			byte[] eachContent;

			// ��Դ�ļ����ݸ��Ƶ���ֵ��ļ���
			if (i != fileNumber - 1) {
				eachContent = Arrays.copyOfRange(fileContent, eachSize * i, eachSize * (i + 1));
			} else {
				eachContent = Arrays.copyOfRange(fileContent, eachSize * i, fileContent.length);
			}

			try {
				FileOutputStream fos = new FileOutputStream(fi);
				fos.write(eachContent);
				fos.close();
				System.out.printf("������ļ� %s,���С�� %d,ÿ���Ĵ�С��%d\n", fi.getAbsoluteFile(), fi.length(), eachContent.length);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}
}
