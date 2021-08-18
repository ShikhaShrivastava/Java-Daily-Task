package com.techment.Day12_MultiThreading;

class Shikha extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Shikha : "+i+" msg : Welcome to Banglore ");
		}
	}
}
class Raina extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			if(i==2)
			{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Raina : "+i+" msg: Hey are you there ");
		}
	}
}
class Juhi extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Juhi : "+i+" msg : Please take care ");
		}
	}
}
public class Multitasking {

	public static void main(String[] args) {
		
		Shikha shikha= new Shikha();
		Raina raina= new Raina();
		Juhi juhi= new Juhi();
		
/*      shikha.run();
		raina.run();
		juhi.run();     */
		
		shikha.start();
		raina.start();
		juhi.start();
		
		

	}

}
