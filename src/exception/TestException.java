package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * ����Ҫ��d�̵�LOL.exe�ļ�������ļ����п��ܲ����ڵ� 
Java��ͨ�� new FileInputStream(f) ��ͼ��ĳ�ļ���
���п����׳��ļ��������쳣FileNotFoundException 
�����������쳣���ͻ��б������ 
 * @author zhu_dully
 *
 */
public class TestException {
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("d:/LoL.exe");
		 //��ͼ���ļ�LOL.exe�����׳�FileNotFoundException�������������쳣���ͻ��б������
		System.out.println("��ͼ�� d:/LOL.exe");
		new FileInputStream(f);
		
	}

}
