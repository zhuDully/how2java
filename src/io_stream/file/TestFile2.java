package io_stream.file;

import java.io.File;
import java.util.Date;

public class TestFile2 {
	public static void main(String[] args) {
		  
        File f = new File("c:/LOLFolder/LOL.exe");
        System.out.println("��ǰ�ļ��ǣ�" +f);
        //�ļ��Ƿ����
        System.out.println("�ж��Ƿ���ڣ�"+f.exists());
         
        //�Ƿ����ļ���
        System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());
          
        //�Ƿ����ļ������ļ��У�
        System.out.println("�ж��Ƿ����ļ���"+f.isFile());
          
        //�ļ�����
        System.out.println("��ȡ�ļ��ĳ��ȣ�"+f.length());
          
        //�ļ�����޸�ʱ��
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("��ȡ�ļ�������޸�ʱ�䣺"+d);
        //�����ļ��޸�ʱ��Ϊ1970.1.1 08:00:00
        f.setLastModified(0);
          
        //�ļ�������
        File f2 =new File("c:/LOLFolder/DOTA.exe");
        f.renameTo(f2);
        System.out.println("��LOL.exe��������DOTA.exe");
         
        System.out.println("ע�⣺ ��Ҫ��C:\\LOLFolderȷʵ����һ��LOL.exe,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ");
    }
}
