package Interface.test;

public interface InterfaceExtends {
	void aaa();
}

interface InterfaceB{
	void bbb();
}

interface InterfaceC extends InterfaceExtends, InterfaceB{ // �ӿڶ�̳�
	void ccc();
}

class Test implements InterfaceC {
	public void aaa() {
		
	}
	public void bbb() {
			
	}
	public void ccc() {
		
	}
}

