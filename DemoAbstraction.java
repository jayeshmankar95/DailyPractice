package com.abstraction;
	//abstract class
abstract class Bike
{
	abstract void run();
}
class Honda extends Bike		// abstract class method
{
	void run()
	{
	System.out.println("Honda run");
	}
}
class Hero extends Bike
{
	 void run()
	{
	System.out.println("Hero run");
	}
}
public class DemoAbstraction {
	public static void main(String[] args) {
		Bike b=new Honda();
		b.run();
		b=new Hero();
		b.run();
		
	}

}
