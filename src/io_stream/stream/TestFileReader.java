package io_stream.stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是AB
        File f = new File("c:/LOLFolder/lol.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}
