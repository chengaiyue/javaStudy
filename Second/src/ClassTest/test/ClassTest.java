package ClassTest.test;

public class ClassTest {
	String name;
	int id;
	int age;
	
	static int a;
	
	public ClassTest(String name, int age) {
		this(); // ����������  ����ʹ��this()��������һ��������  ***������ڵ�һ��
		this.name = name;
		this.age = age;
	}
	
	public ClassTest() {
		//this("name", 22);
	}	
	
	public static void add() {
		System.out.print(a);
	}
	
	public void say() {
		System.out.print(a + name);
	}
	
	public static void main(String[] args) {
		ClassTest s = new ClassTest();
		
		s.name = "�ų̳�";
		s.say();
	}
}