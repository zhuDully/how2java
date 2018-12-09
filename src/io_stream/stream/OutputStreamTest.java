package io_stream.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
	public static void main(String[] args) {
		/*以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
		但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
		那么怎么自动创建xyz目录？
		如果是多层目录 d:/xyz/abc/def/lol2.txt 呢？*/
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
