package io_stream.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) {
		// ׼���ļ�lol2.txt
        File f = new File("c:/LOLFolder/lol2.txt");
        // ���������ļ���Writer
        try (FileWriter fr = new FileWriter(f)) {
            // ���ַ�������ʽ������д�뵽�ļ���
            String data="abcdefg1234567890";
            char[] cs = data.toCharArray();
            fr.write(cs);
  
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}
