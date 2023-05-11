import java.util.*;
public class PowNum {
	
	static int power(int N, int P)
	{
		int pow=1;
		for(int i=1;i<=P;i++)
			
		pow=pow*N;
		return pow;
		
	}
	public static void main(String[] args)
	
	{
		int N,P;
		System.out.println("enter number N");
		Scanner sc=new Scanner (System.in);
		N=sc.nextInt();
		System.out.println("enter number P");
		P=sc.nextInt();
		System.out.println(power(N,P));
	}

}
