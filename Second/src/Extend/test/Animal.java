package Extend.test;

public class Animal {
	/*
	 * ֻ�е��̳�
	 * ��̳�Ҫͨ���ӿ�ʵ��
	 * extends
	 * Ĭ�ϼ̳�Object
	 */
	
	String name;
	public void  sleep(){
		System.out.print(name);
	}
	public void run(){
		System.out.print("��");
	}
	
	
	public static void main(String[] args) {
		Animal s = new Animal();
		System.out.print(s.toString());
		System.out.print(s.toString());
	}
}


class Bird extends Animal {
	public void run() { // ��д����
		super.run(); // ͨ��super ���ø����run
		System.out.print("��");
	}
}