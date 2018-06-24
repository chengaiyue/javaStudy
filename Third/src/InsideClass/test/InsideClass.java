package InsideClass.test;

public class InsideClass {
	public static void main(String[] args) {
		// 方法内也可包含类
		Face s = new Face();
		Face.Nose n = s.new Nose();
		Face.Ear e = new Face.Ear();
	}
}

class Face {
	int type;
	// 内部非静态类 单独属于外部类的某个对象  不能有静态属性 静态方法  静态初始化块
	class Nose {
		String type;
		void test() {
			// this.type => String type
			// Face.this.type => int type
		}
	}
	
	// 静态内部类  不可调用外部非静态
	static class Ear {
		
	}
}
