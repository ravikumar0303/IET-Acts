import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
    
  int n =0,s=0,r,c;
  System.out.println("Enter your number:");
  Scanner p=new Scanner(System.in);
  n=p.nextInt();
  c=n;
   while(n>0)
   {
     r=n%10;
     s=(s*10)+r;
     n=n/10;
	}
   if(c==s)
   {
	   System.out.println("Your number is Pelindrome");
   }
   else
   {
	   System.out.println("Number is Not palindrome");
   }
	}
}
