package com.interfac;

public abstract class MainOperater implements Operater {
	public static void main(String[] args) {
		
		Operater add = (a,b) -> {
			System.out.println("Mul is "+a*b);
			System.out.println("add is "+a+b);
			return a;
		};
		int result=add.doOperation(5,5);
	}
		
}	
	