package exception;

public class MyStringBuffer {
	int capacity = 16;// Ĭ������
	int length = 0;
	char[] value;

	public MyStringBuffer() {
		// TODO �Զ����ɵĹ��캯�����
		value = new char[capacity];
	}

	public MyStringBuffer(String str) {
		this();
		if (null == str) {
			return;
		}
		// Ĭ�������Ƿ��str�ĳ���С
		if (capacity < str.length()) {
			// ��Ĭ��������������2��
			capacity = value.length * 2;
			value = new char[capacity];
		}
		// Ĭ�������Ƿ��str�ĳ��ȴ�
		if (capacity >= str.length()) {
			// src:Դ���飻 srcPos:Դ����Ҫ���Ƶ���ʼλ�ã�
			// dest:Ŀ�����飻destPos:Ŀ��������õ���ʼλ�ã� length:���Ƶĳ��ȡ�
			System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
		}
		length = str.length();
	}

	public void insert(int pos, char b) throws Exception {
		insert(pos, String.valueOf(b));
	}

	public void delete(int start) throws Exception {

		delete(start, length);
	}

	public int length() {
		// TODO Auto-generated method stub
		return length;
	}

	public String toString() {

		char[] realValue = new char[length];

		System.arraycopy(value, 0, realValue, 0, length);

		return new String(realValue);

	}

	class IndexIsNagetiveException extends Exception {
		public IndexIsNagetiveException() {

		}

		public IndexIsNagetiveException(String msg) {
			super(msg);
		}

	}

	class IndexIsOutofRangeException extends Exception {
		public IndexIsOutofRangeException() {
		}

		public IndexIsOutofRangeException(String s) {
			super(s);
		}
	}
	/**
	 * 
	 * @param start ��ʼ����ֵ
	 * @param end	��������ֵ
	 * @throws Exception
	 */
	public void delete(int start, int end) throws Exception {
		// �߽������ж�
		if (start < 0) {
			throw new IndexIsNagetiveException("�±�Ϊ���쳣");
		}

		if (start > length) {
			throw new IndexIsOutofRangeException("�±곬����Χ�쳣");
		}

		if (end < 0) {
			throw new IndexIsNagetiveException("�±�Ϊ���쳣");
		}

		if (end > length) {
			throw new IndexIsOutofRangeException("�±곬����Χ�쳣");
		}

		if (start >= end) {
			throw new IndexIsOutofRangeException("�±곬����Χ�쳣");
		}

		System.arraycopy(value, end, value, start, length - end);
		length -= end - start;

	}
	/**
	 * 
	 * @param pos ��������ֵ
	 * @param b	  �����ַ���
	 * @throws Exception
	 */
	public void insert(int pos, String b) throws Exception {

		// �߽������ж�
		if (pos < 0) {
			throw new IndexIsNagetiveException("�±�Ϊ���쳣");
		}

		if (pos > length) {
			throw new IndexIsOutofRangeException("�±곬����Χ�쳣");
		}

		if (null == b) {
			throw new NullPointerException("Ϊ��");
		}

		// ����
		while (length + b.length() > capacity) {
			//��ԭ����+�����ַ������ȣ�*1.5��Ȼ��ȡ����
			capacity = (int) ((length + b.length()) * 1.5f);
			char[] newValue = new char[capacity];
			// src:Դ���飻 srcPos:Դ����Ҫ���Ƶ���ʼλ�ã�
			// dest:Ŀ�����飻destPos:Ŀ��������õ���ʼλ�ã� length:���Ƶĳ��ȡ�
			System.arraycopy(value, 0, newValue, 0, length);
			value = newValue;
		}

		char[] cs = b.toCharArray();

		// �Ȱ��Ѿ����ڵ�����������
		System.arraycopy(value, pos, value, pos + cs.length, length - pos);
		// ��Ҫ��������ݲ��뵽ָ��λ��
		System.arraycopy(cs, 0, value, pos, cs.length);
		//���³���
		length = length + cs.length;

	}

	public static void main(String[] args) {
		MyStringBuffer sb = new MyStringBuffer("there ligtht");
		System.out.println("ԭ�ַ�����" + sb);
		try {
			sb.insert(-4, "let ");
		} catch (Exception e) {
			System.out.println("�쳣�ľ���ԭ��" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("\nԭ�ַ�����" + sb);
		try {
			sb.delete(0, 44);
		} catch (Exception e) {
			System.out.println("�쳣�ľ���ԭ��" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(sb);

	}
}
