package InsideClass.test;

public class InsideClass {
	public static void main(String[] args) {
		// ������Ҳ�ɰ�����
		Face s = new Face();
		Face.Nose n = s.new Nose();
		Face.Ear e = new Face.Ear();
	}
}

class Face {
	int type;
	// �ڲ��Ǿ�̬�� ���������ⲿ���ĳ������  �����о�̬���� ��̬����  ��̬��ʼ����
	class Nose {
		String type;
		void test() {
			// this.type => String type
			// Face.this.type => int type
		}
	}
	
	// ��̬�ڲ���  ���ɵ����ⲿ�Ǿ�̬
	static class Ear {
		
	}
}