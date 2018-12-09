package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 比如要打开d盘的LOL.exe文件，这个文件是有可能不存在的 
Java中通过 new FileInputStream(f) 试图打开某文件，
就有可能抛出文件不存在异常FileNotFoundException 
如果不处理该异常，就会有编译错误 
 * @author zhu_dully
 *
 */
public class TestException {
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("d:/LoL.exe");
		 //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
		System.out.println("试图打开 d:/LOL.exe");
		new FileInputStream(f);
		
	}

}
