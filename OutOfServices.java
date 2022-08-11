package com.abstraction;

public class OutOfServices {
	public static void main(String[] args)
	{
		Service s=new Courier();
		s.provideService();
		
		s=new Catering();
		s.provideService();
	}

}
