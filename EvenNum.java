import java.util.*;
public class EvenNum {
	int n,p,i;
	int count=0;
	Scanner sc=new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("enter your number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			
		{
			 count=count+2;
			 System.out.println(count);
		
			
		}
           
	}
	public static void main(String[] args)
	{
		EvenNum en=new EvenNum();
		en.acceptData();
	}

}
