import java.util.*;
public class SwapNum {
	

	public static void main(String[] args)
	{
		int a,b,temp = 0;
		System.out.println("enter your number1");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter your number");
		b=sc.nextInt();
		temp=b;
		b=a;
		a=temp;
		System.out.println("swap is a="+a + " =b"+b);
	}

}
