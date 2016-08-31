package com.vogella.javaintro.base;

public class MyClassImpl implements MyInterface {

	@Override
	public void test() {
	}

	@Override
	public void write(String s) {
	}
	
	public static void main(String[] args) {
		MyClassImpl impl = new MyClassImpl();
		System.out.println(impl.reserveString("Lars Vogel"));
	}

}
