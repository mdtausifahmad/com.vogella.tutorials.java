package testing;

public interface MyInterface {

		// constant definition
		String URL = "http://www.vogella.com";

		// public abstract methods
		void test();
		void write(String s);
		
		// default method
		default String reserveString(String s){
			return new StringBuilder(s).reverse().toString();
		}
}
