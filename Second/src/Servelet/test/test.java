package Servelet.test;

public class test {
	public static void main(String[] args) {

		ServeletTest s = new MyServletTest();
		s.service();
		
		MyServletTest s2 = (MyServletTest)(s);
		
		s2.doPost();
	}
}
