package io_stream.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
但是，如果是写入数据到c:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
那么怎么自动创建xyz目录？
如果是多层目录 c:/xyz/abc/def/lol2.txt 呢？*/
public class Test {
	public static void main(String[] args) {
		File file = new File("./LOLFolder/lol.txt");// 创建基于文件的输入流
		//File file = new File("./mywork/work.txt");

		FileOutputStream out = null;
	    try {
	        if (!file.exists()) {
	            // 先得到文件的上级目录，并创建上级目录，在创建文件
	            file.getParentFile().mkdir();
	            file.createNewFile();
	        }

	        //创建文件输出流
	        out = new FileOutputStream(file);
	        //将字符串转化为字节
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
