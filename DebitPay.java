package com.interfac;

public class DebitPay implements Payment {
	
	public void pay()
	{
		System.out.println("Payment through creadit-Card");
	}
	public void useDebid()
	{
		System.out.println("use debit");
	}

}
class CreadiPay implements Payment {
	public void pay() 
	{
		System.out.println("paying throutg debit");
	}
	public void useCredit()
	{
		System.out.println("use credit");
	}
}
