package com.interfac;

public class Classroom implements Clean,Wash
{
	public void doWashing()
	{
		System.out.println("wash class daily");
	}

	public void doPolishing()
	{
		System.out.println("class clean daily");
	}

	public void doCleaning() 
	{
		System.out.println("clean class daily");	
	}
	public void dospreWashing()
	{
		System.out.println("spreed");
	}
	public static void main(String[] args) {
		Clean c=new Kichen();
		c.doCleaning();
		
		c=new Classroom();
		c.doWashing();
//		
//		c=new CarServising();
//		c.doPolishing();
//		Wash w=new 
		
		
	
	}

	@Override
	public void doWashing1() {
		// TODO Auto-generated method stub
		
	}
}
