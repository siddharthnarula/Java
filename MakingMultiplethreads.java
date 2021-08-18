import java.util.*;
public class Hal extends Thread
{
	public void run()
	{
		for(int i=1;i<6;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Good Morning");
				Thread.sleep(2000);
				System.out.println("hello");
				Thread.sleep(3000);
				System.out.println("Welcome");
			}catch(Exception e)
			{
			System.out.println(e);
			}
		}
	}
public static void main(String[] args)
{
	Hal h=new Hal();
	h.start();
}
}
} 
}
