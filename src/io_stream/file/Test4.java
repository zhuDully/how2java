package io_stream.file;

import java.io.File;
/**
 * һ��˵������ϵͳ���ᰲװ��C�̣����Ի���һ�� C:\WINDOWSĿ¼��
�������Ŀ¼�����е��ļ�(���ñ�����Ŀ¼)
�ҳ���Щ�ļ�����ĺ���С(��0)���Ǹ��ļ�����ӡ�����ǵ��ļ���
 * @author zhu_dully
 *
 */
public class Test4 {
	static long min = 3598954, max = -1;
	static String maxName = "";
	static String minName = "";

	public static void main(String[] args) {
		System.out.println(getMaxAndMin("C:/XMPCache"));
	}

	public static String getMaxAndMin(String path) {
		File f1 = new File(path);
		// ���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		File[] list = f1.listFiles();
		System.out.println("��ǰ�ļ����µ������ļ�:"+list.length);
		if (list != null && list.length != 0) {
			for (int i = 0; i < list.length; ++i) {

				// �õ����
				if (!list[i].isDirectory()) {//�Ƿ����ļ���
					if (list[i].length() > max) {//�ļ������Ƿ����max
						max = list[i].length();
						maxName = list[i].getAbsolutePath();

					}
				} else {
					System.out.println("��ǰ���ڱ���" + list[i].getAbsolutePath());
					getMaxAndMin(list[i].getAbsolutePath());

				}

				// �õ���С
				if (!list[i].isDirectory()) {
					if (list[i].length() < min && list[i].length() != 0) {
						min = list[i].length();
						minName = list[i].getAbsolutePath();
					}
				} else {
					getMaxAndMin(list[i].getAbsolutePath());
				}
			}
		}
		return "�����ļ���" + maxName + ",���С��" + max + "���ֽ�" + "\n" + "��С���ļ���" + minName + ",���С��" + min + "���ֽ�";
	}
}
