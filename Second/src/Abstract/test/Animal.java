package Abstract.test;

public abstract class Animal { // 抽象类  无法new 抽象类不能实例化
	public abstract void run(); // 抽象方法
}

class Cat extends Animal {
	
	@Override  // 注解
	public void run () {
		System.out.print("必须要实现抽象方法");
	}
}
