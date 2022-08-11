package com.interfac;

public interface Service3 {
	float serviceTax=18.5f;
	void provideService(String details);
	static void provideOnlineService(String u,String p)
	{
		System.out.println("Ypu will be authiticated by"+" using username and password");
	}
	default void discountinueService()
	{
		System.out.println("your service is stop");
	}

}
interface OnlineService extends Service3
{
	void m1();	
}
class Registration implements Service3
{
	public void provideService(String s)
	{
		
		System.out.println("take our service with service tax"+"serviceTax");
	}
	
	public void discontinueService()
	{
		
		
		
		System.out.println("your service is stop after 48 hour");
	}
}
