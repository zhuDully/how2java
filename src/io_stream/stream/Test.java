package io_stream.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**���ֽ�������ʽ���ļ�д������ �е����ӣ���lol2.txt�����ڵ�ʱ���ǻ��Զ�����lol2.txt�ļ��ġ�
���ǣ������д�����ݵ�c:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڵĻ����ͻ��׳��쳣��
��ô��ô�Զ�����xyzĿ¼��
����Ƕ��Ŀ¼ c:/xyz/abc/def/lol2.txt �أ�*/
public class Test {
	public static void main(String[] args) {
		File file = new File("./LOLFolder/lol.txt");// ���������ļ���������
		//File file = new File("./mywork/work.txt");

		FileOutputStream out = null;
	    try {
	        if (!file.exists()) {
	            // �ȵõ��ļ����ϼ�Ŀ¼���������ϼ�Ŀ¼���ڴ����ļ�
	            file.getParentFile().mkdir();
	            file.createNewFile();
	        }

	        //�����ļ������
	        out = new FileOutputStream(file);
	        //���ַ���ת��Ϊ�ֽ�
	        byte[] byteArr = "FileInputStream Test".getBytes();
	        out.write(byteArr);
	        out.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
