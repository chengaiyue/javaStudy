package Extend.test;

public class Animal {
	/*
	 * 只有单继承
	 * 多继承要通过接口实现
	 * extends
	 * 默认继承Object
	 */
	
	String name;
	public void  sleep(){
		System.out.print(name);
	}
	public void run(){
		System.out.print("跑");
	}
	
	
	public static void main(String[] args) {
		Animal s = new Animal();
		System.out.print(s.toString());
		System.out.print(s.toString());
	}
}


class Bird extends Animal {
	public void run() { // 重写方法
		super.run(); // 通过super 调用父类的run
		System.out.print("飞");
	}
}