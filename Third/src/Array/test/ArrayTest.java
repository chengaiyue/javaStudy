package Array.test;

public class ArrayTest {
	public static void main(String[] args) {
		// 数组是相同数据类型的有序集合
		// 数组是对象 数组元素相当于对象的成员变量
		// 数组长度是确定的  不可变  越界报错
		int[] a = new int[14]; // [14] 指定数组的长度
		System.out.print(a[0]);
		
		// 声明
		int[] b;
		
		// 创建数组对象
		b = new int[4];
		
		// 初始化三种方式
		// 默认初始化：数组元素相当于对象的成员变量  默认值跟成员变量的规则一样 数字 -> 0 布尔 -> false char -> \u0000 引用 -> null
		// 动态初始化
		for (int i=0; i<b.length; i++) {
			b[i] = i * 12;
		}
		// 静态初始化
		int[] c = {1, 2, 4, 5, 0};
		
		char[] d = {'a', 'b', 'c'};
		String str = new String(d);
		
		System.out.print(str);
	}
}
