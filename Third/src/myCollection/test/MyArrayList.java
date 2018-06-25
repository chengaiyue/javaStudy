package myCollection.test;

/**
 * 模拟实现JDK中的ArrayList类
 * @author 62739
 *
 */
public class MyArrayList {
	
	private Object[] value;
	
	private int size;
	
	public MyArrayList() {
//		value = new Object[16];
		this(16);
	}
	
	public MyArrayList(int size) {
		if (size < 0) {
			try {
				throw new Exception();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		value = new Object[size];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void add(Object object) {
		value[size] = object;
		size++;
		if (size >= value.length) {
			// 扩容
			int newCapacity = value.length * 2;
			Object[] newList = new Object[newCapacity];
			for(int i = 0; i < value.length; i++) {
				newList[i] = value[i];
			}
			value = newList;
		}
	}
	
	public Object get(int index) {
		if (index >= size || index < 0) {
			try {
				throw new Exception();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		return value[index];
	}	
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		MyArrayList s = new MyArrayList();
		Human m = new Human();
		m.name = "zcc";
		s.add("abc");
		s.add(4);
		s.add(m);
		String[] a = {"a", "c","d"};
		System.out.print(s.get(0));
	}
}

class Human {
	String name;
}
