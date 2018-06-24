package String.test;

public class TestString {
	
	public static void main(String[] args) {
		// String 称为不可变字符序列
		String str = new String("abcd");
		String str2 = new String("abcd");
		
		System.out.print(str.equals(str2)); // true 比较内容是否相等
		System.out.print(str == str2); // false
		
		String str3 = "ab";
		String str4 = "ab";
		
		System.out.print(str4.equals(str3));  // true
		System.out.print(str4 == str3);  // true
		
		str.charAt(1);
		str.indexOf(1);
		str.replace("a", "c");
		str.split(",");
		str.trim();
		str.substring(0, 5);
		str.toLowerCase();
		str.equalsIgnoreCase(str2);
		str.lastIndexOf(1);
	}
}
