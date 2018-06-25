package Array.test;

public class DimensionalArray {
	/*
	 * ´òÓ¡¾ØÕó
	 */
	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + '\t');
			}
			System.out.println();
		}
	}
	
	/*
	 * ¾ØÕó¼Ó·¨
	 */
	public static int[][] add(int[][] a, int[][] b) {
		int len = a.length;
		int[][] c = new int[len][len];
		for (int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[][] a = {
				{1, 2,4},
				{5, 6, 9}
		};
		
		int[][] b = new int[3][];
		
	}
}
