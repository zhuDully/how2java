package io_stream.stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String[] args) {
        // ׼���ļ�lol.txt���е�������AB
        File f = new File("c:/LOLFolder/lol.txt");
        // ���������ļ���Reader
        try (FileReader fr = new FileReader(f)) {
            // �����ַ����飬�䳤�Ⱦ����ļ��ĳ���
            char[] all = new char[(int) f.length()];
            // ���ַ�������ʽ��ȡ�ļ���������
            fr.read(all);
            for (char b : all) {
                // ��ӡ������A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}
