package String.test;

public class StringBuild {
	public static void main(String[] args) {
		// StringBuilder 可变字符序列 线程不安全 效率高
		// StringBuffer  线程安全  效率相对低
		StringBuilder sb = new StringBuilder();// 初始数组长度为16
		StringBuilder sb2 = new StringBuilder(32);// 初始数组长度为32
		StringBuilder sb3 = new StringBuilder("abcd");
		
		sb3.append("edf");
//		System.out.println(sb3);
		
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {
			s.append(i);
		}
		
		System.out.print(s);
	}
}
	