package Interface.test;

public interface MyInterface {
	// 接口理只有: 常量和抽象方法
	String MAX_GREAD = "BOSS"; // public static final 接口中定义常量写或者不写都有这些
	int MAX_SPEED = 120;
	void test01(); // public abstract 接口中定义方法写不写都是这样
	int test02(int a, int b);
}

