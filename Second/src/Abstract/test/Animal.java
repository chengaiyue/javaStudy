package Abstract.test;

public abstract class Animal { // ������  �޷�new �����಻��ʵ����
	public abstract void run(); // ���󷽷�
}

class Cat extends Animal {
	
	@Override  // ע��
	public void run () {
		System.out.print("����Ҫʵ�ֳ��󷽷�");
	}
}
