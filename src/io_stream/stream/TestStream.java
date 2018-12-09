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
			File f = new File("c:/LOLFolder/lol.txt");// ���������ļ���������
			File f2 = new File("c:/LOLFolder/xyz/lol.txt");// ���������ļ���������

			// ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��Java�������������Ҳ���Ƕ�ȡ���ڴ���
			/* InputStream���ֽ���������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡� FileInputStream
			 * ��InputStream���࣬��FileInputStream Ϊ�������ļ���ȡ*/
			FileInputStream fis = new FileInputStream(f);

			// �����ֽ����飬�䳤�Ⱦ����ļ��ĳ���
			byte[] all = new byte[(int) f.length()];
			// ���ֽ�������ʽ��ȡ�ļ���������
			fis.read(all);
			for (byte b : all) {
				// ��ӡ������65 66
				System.out.println(b);
			}
			// ÿ��ʹ����������Ӧ�ý��йر�
			fis.close();

			// �����
			/*OutputStream���ֽ��������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
			FileOutputStream ��OutputStream���࣬��FileOutputStream Ϊ�����ļ�д������*/
			//f = f2;
			FileOutputStream out = new FileOutputStream(f);
			

			// ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
            byte data[] = { 88, 89 };
 
            // ���������ļ��������
            FileOutputStream fos = new FileOutputStream(f);
            // ������д�뵽�����
            fos.write(data);
            // �ر������
            fos.close();
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
