package Interface.test;

interface Run{
	
}

public class MyClass implements MyInterface, Run { // ʵ�ֽӿ�, ʵ�ֶ���ӿڣ����ܴ���ʵ������
	public void test01() {
		
	}
	
	public int test02(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.print(MyInterface.MAX_GREAD);
	}
}