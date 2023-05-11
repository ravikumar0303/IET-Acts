import java.util.*;
public class CompInterst {
	public static void main(String[] args)
	{
		
		float p,r,t;
		
		System.out.println("Enter the Amount:");
		Scanner sc=new Scanner(System.in);
	    p=sc.nextInt();
	    System.out.println("Enter the Rate:");
	    r=sc.nextInt();
	    System.out.println("Enter the Time:");
	    t=sc.nextInt();
	    //x=(1+(r/100));
	  float CI=(float) (p*(Math.pow((1+ r/100),t)));
	   System.out.println("amount="+CI);
	   float A=(CI-p);
	    System.out.println("CI ="+A);
	}

}
