package io_stream.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
	public static void main(String[] args) {
		/*���ֽ�������ʽ���ļ�д������ �е����ӣ���lol2.txt�����ڵ�ʱ���ǻ��Զ�����lol2.txt�ļ��ġ�
		���ǣ������д�����ݵ�d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڵĻ����ͻ��׳��쳣��
		��ô��ô�Զ�����xyzĿ¼��
		����Ƕ��Ŀ¼ d:/xyz/abc/def/lol2.txt �أ�*/
		 try {
	            File f = new File("c:/LOLFolder/xy/lol2.txt");
	            if(f.getParentFile().exists()==false) {
	                f.getParentFile().mkdirs();
	            }
	            byte[] b = {87,82};
	            FileOutputStream fos = new FileOutputStream(f);
	            fos.write(b);
	            FileInputStream fis = new FileInputStream(f);
	            byte[] all = new byte[(int)f.length()];
	            fis.read(all);
	            for(byte b1:all) {
	                System.out.println(b1);
	            }
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
}
