import java.util.*;
class Primeecp
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       String  primeNumbers = "";
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println(primeNumbers);
   }
}
	


