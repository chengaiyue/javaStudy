package String.test;

public class StringBuild {
	public static void main(String[] args) {
		// StringBuilder �ɱ��ַ����� �̲߳���ȫ Ч�ʸ�
		// StringBuffer  �̰߳�ȫ  Ч����Ե�
		StringBuilder sb = new StringBuilder();// ��ʼ���鳤��Ϊ16
		StringBuilder sb2 = new StringBuilder(32);// ��ʼ���鳤��Ϊ32
		StringBuilder sb3 = new StringBuilder("abcd");
		
		sb3.append("edf");
//		System.out.println(sb3);
		
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {
			s.append(i);
		}
		
		System.out.print(s);
	}
}
	