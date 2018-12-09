package exception;

public class MyStringBuffer {
	int capacity = 16;// 默认容量
	int length = 0;
	char[] value;

	public MyStringBuffer() {
		// TODO 自动生成的构造函数存根
		value = new char[capacity];
	}

	public MyStringBuffer(String str) {
		this();
		if (null == str) {
			return;
		}
		// 默认容量是否比str的长度小
		if (capacity < str.length()) {
			// 将默认容器长度扩大2倍
			capacity = value.length * 2;
			value = new char[capacity];
		}
		// 默认容量是否比str的长度大
		if (capacity >= str.length()) {
			// src:源数组； srcPos:源数组要复制的起始位置；
			// dest:目的数组；destPos:目的数组放置的起始位置； length:复制的长度。
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
	 * @param start 开始索引值
	 * @param end	结束索引值
	 * @throws Exception
	 */
	public void delete(int start, int end) throws Exception {
		// 边界条件判断
		if (start < 0) {
			throw new IndexIsNagetiveException("下标为负异常");
		}

		if (start > length) {
			throw new IndexIsOutofRangeException("下标超出范围异常");
		}

		if (end < 0) {
			throw new IndexIsNagetiveException("下标为负异常");
		}

		if (end > length) {
			throw new IndexIsOutofRangeException("下标超出范围异常");
		}

		if (start >= end) {
			throw new IndexIsOutofRangeException("下标超出范围异常");
		}

		System.arraycopy(value, end, value, start, length - end);
		length -= end - start;

	}
	/**
	 * 
	 * @param pos 插入索引值
	 * @param b	  插入字符串
	 * @throws Exception
	 */
	public void insert(int pos, String b) throws Exception {

		// 边界条件判断
		if (pos < 0) {
			throw new IndexIsNagetiveException("下标为负异常");
		}

		if (pos > length) {
			throw new IndexIsOutofRangeException("下标超出范围异常");
		}

		if (null == b) {
			throw new NullPointerException("为空");
		}

		// 扩容
		while (length + b.length() > capacity) {
			//（原长度+加入字符串长度）*1.5，然后取整数
			capacity = (int) ((length + b.length()) * 1.5f);
			char[] newValue = new char[capacity];
			// src:源数组； srcPos:源数组要复制的起始位置；
			// dest:目的数组；destPos:目的数组放置的起始位置； length:复制的长度。
			System.arraycopy(value, 0, newValue, 0, length);
			value = newValue;
		}

		char[] cs = b.toCharArray();

		// 先把已经存在的数据往后移
		System.arraycopy(value, pos, value, pos + cs.length, length - pos);
		// 把要插入的数据插入到指定位置
		System.arraycopy(cs, 0, value, pos, cs.length);
		//更新长度
		length = length + cs.length;

	}

	public static void main(String[] args) {
		MyStringBuffer sb = new MyStringBuffer("there ligtht");
		System.out.println("原字符串：" + sb);
		try {
			sb.insert(-4, "let ");
		} catch (Exception e) {
			System.out.println("异常的具体原因：" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("\n原字符串：" + sb);
		try {
			sb.delete(0, 44);
		} catch (Exception e) {
			System.out.println("异常的具体原因：" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(sb);

	}
}
