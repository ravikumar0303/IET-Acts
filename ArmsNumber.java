import java.util.*;
public class ArmsNumber {
	public static void main(String[] args)
	{
		
		int num,number,temp,total=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number/=10;
		}
		if (total==num)
			System.out.println(num+ " is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong Number");
	}

}

