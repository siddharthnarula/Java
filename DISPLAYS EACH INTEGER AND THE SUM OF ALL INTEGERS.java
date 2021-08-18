import java.util.*;
class SumOfInteger
{
	public static void main(String args [])
	{
		int a,sum=0;
		System.out.println("Enter the size of list");
		Scanner scn=new Scanner(System.in);
		a = scn.nextInt();
		int numbers[]=new int[a];
		for(int i=0;i<a;i++)
		{
			numbers[i]=scn.nextInt();
		}
		for (int i=0;i<a;i++)
		{
			sum=sum+numbers[i];
			 
		}
		System.out.println("THE SUM OF NUMBERS IN LIST ARE "+sum);
	}
}	


