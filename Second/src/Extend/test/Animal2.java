package Extend.test;

public class Animal2 {
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


class Bird2 {
	Animal2 animal2 = new Animal2(); // ���
	
	public void run() { // ��д����
		System.out.print("��");
	}
}