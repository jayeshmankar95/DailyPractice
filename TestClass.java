package com.interfac;

interface In1
{
	int a=20;
	default void display()
	{
		System.out.println("Hello "+a);
	}
}

public class TestClass implements In1 {
	public static void main(String[] args) {
	TestClass tc=new TestClass();
	tc.display();
	}

}
