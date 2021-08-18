import java.util.*;
class sorting
{
	public static void main(String args [])
	{
		int n;
		System.out.println("Enter the number of names you want to enter");
		Scanner scn = new Scanner(System.in);
		n=scn.nextInt();
		String names[]=new String[n];
		for(int i=0;i<n;i++)
		{
			names[i]=scn.nextLine();
		}
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for(int i=1;i<n;i++)
		{
			System.out.println(names[i]);
		}
	}
}
