import java.util.*;
public class Factorial
{
 
	public static void main(String[] args)
	{
		
		 int i,f=1;
		 int n;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
        	f=f*i;
        
        }
        	  System.out.println("factorial="+f);
        	  
        
	}
}
