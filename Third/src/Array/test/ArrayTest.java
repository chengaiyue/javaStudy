package Array.test;

public class ArrayTest {
	public static void main(String[] args) {
		// ��������ͬ�������͵����򼯺�
		// �����Ƕ��� ����Ԫ���൱�ڶ���ĳ�Ա����
		// ���鳤����ȷ����  ���ɱ�  Խ�籨��
		int[] a = new int[14]; // [14] ָ������ĳ���
		System.out.print(a[0]);
		
		// ����
		int[] b;
		
		// �����������
		b = new int[4];
		
		// ��ʼ�����ַ�ʽ
		// Ĭ�ϳ�ʼ��������Ԫ���൱�ڶ���ĳ�Ա����  Ĭ��ֵ����Ա�����Ĺ���һ�� ���� -> 0 ���� -> false char -> \u0000 ���� -> null
		// ��̬��ʼ��
		for (int i=0; i<b.length; i++) {
			b[i] = i * 12;
		}
		// ��̬��ʼ��
		int[] c = {1, 2, 4, 5, 0};
		
		char[] d = {'a', 'b', 'c'};
		String str = new String(d);
		
		System.out.print(str);
	}
}