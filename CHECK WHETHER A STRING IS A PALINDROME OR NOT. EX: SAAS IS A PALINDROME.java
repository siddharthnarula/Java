import java.util.*;
class StringPalindrome
{
	public static void main(String args[])
	{
		String b="";
		System.out.println("Enter a String");
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		int n = a.length();
		for (int i =n-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("It is a String Palindrome");
		}
		else
		{
			System.out.println("It is not a String Palindrome");
		}
	}
}
