package String.test;

public class StringBuilder2 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcdef");
		s.delete(2, 4); // 包含第二个 不包含第四个
		
		System.out.print(s);
		
		StringBuffer s2 = new StringBuffer();
	}
}
