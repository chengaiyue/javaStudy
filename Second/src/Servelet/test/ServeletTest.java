package Servelet.test;

public class ServeletTest {
	// 多态  继承  方法重写 父类引用指向子类对象
	public void service() {
		System.out.println("Service");
		doGet();
	}
	
	public void doGet() {
		System.out.println("Get");
	}
	
}
