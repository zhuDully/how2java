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

			// ��ȡÿһ�����ļ�
			while (true) {
				//��ȡÿ�����ļ����ļ���
				File eachFile = new File(folder, fileName + "-" + index++ +".txt");
				if (!eachFile.exists()) {
					break;
				}
				// ��һ���ļ���ȡ���ڴ���
				FileInputStream fis = new FileInputStream(eachFile);
				byte[] eachContent = new byte[(int) eachFile.length()];
				fis.read(eachContent);
				fis.close();

				//��������������д���������
				fos.write(eachContent);
				fos.flush();
				System.out.printf("�����ļ� %sд����Ŀ���ļ� ��", eachFile);
				System.out.println();
			}

			fos.close();
			System.out.printf("���Ŀ���ļ��Ĵ�С��%d�ֽڣ�", desFile.length());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
