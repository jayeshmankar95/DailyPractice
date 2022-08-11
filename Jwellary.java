package com.interfac;

public class Jwellary implements Clean1{
	public void doWashing()
	{
		System.out.println("washing");
	}
	public void polish()
	{
		System.out.println("polish");
	}
	public static void main(String[] args) {
//		Clean1 s=new Jwellary();
//		s.doWashing();
		
		Jwellary s1=new Jwellary();
		s1.polish();
		s1.doWashing();
		
	
		
		
	}

}
