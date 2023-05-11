import java.util.Scanner;

  class CheckPrime
   {
     public static void main(String[] args)
    {

       System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
          int i;j=0;k=0;
           j=n/2;

       if(n==0 || n==1)
    {
  System.out.println("number is not prime");
}

 else
 {
    for(int i=2;i<=n;i++)
    {
     if(n%j==0)
      {
      k=0;
     System.out.println("number is not prime");
     }
   
 else
  {
   System.out.println("Prime number");
  }
}
}

