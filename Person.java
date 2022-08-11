package com.interfac;

public class Person
{
	int id;
	String name;
	int age;
	Payment db;
	Person(){}
	public Person(int id, String name, int age, DebitPay db) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.db = db;
	}
	public Person(int id, String name, int age, CreadiPay db) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.db = db;
	}
	
	public void enjoyShopping()
	{
		System.out.println(name+"enjoy shopping");
		db.pay();	
	}
	public static void main(String[] args)
	{
		DebitPay dp=new DebitPay();
		//dp.pay();
		CreadiPay cp=new CreadiPay();
		Person p1= new Person(76," sham ",54,cp); 
		p1.enjoyShopping();
	  // cp=new Person(13, "arjun", 54, cp);

		Person p=new Person(12, " Ram ", 34, dp);
		p.enjoyShopping();
		
	}
	
}
