
public class Str {
	public static void main(String[] args) {
//		byte 1个字节 正负120
//		short 2个字节 正负3W
//		int 正负21亿
//		long
//		bigDecimal bigInteger
		
// 		进制转换
//			Integer.toBinaryString()
//			Integer.toOctalString()
//			Integer.toHexString()
		
		
		// char 可以和数字之间进行转换
		// char a = (char)10;
		
		char a = 35;
		
		System.out.print(a);
		
		/*
		 * 自动类型转换
		 * byte -> short -> int -> long
		 * char -> int
		 * int -> double
		 * float -> double
		 * 
		 * int -> float   long -> float  long -> double   有可能造成精度丢失
		 * */
		
		char c = 90;
		System.out.println(c);
	}
}
