import java.util.*;
public class Calculator 
{
	int n1,n2,R,choice;
	Scanner s=new Scanner (System.in);
  public void acceptData()
  { 
	  System.out.println("Enter number n1");
	  
	   n1=s.nextInt();
	  System.out.println("Enter number n2");
	    
	  n2=s.nextInt();
	  
  }
  public void calculation()
  {  
  do{
	  System.out.println("Your choices are following");
	  System.out.println(" 1.Add\n 2.Sub\n 3.Mul\n 4.Div\n 0.Exit\n"); 
       System.out.println("Enter your choice");
	    choice=s.nextInt(); 
		
	  switch(choice)
	  
	  {
	  case 1: R=(n1+n2);
	  System.out.println("ADDITION= "+R);
	      break;
	  case 2: R=(n1-n2);
	  System.out.println("SUB="+R);
	     break;
	  case 3: R=(n1*n2);
	  System.out.println("MUL= "+R);
	  break;
	  case 4: R=(n1/n2);
	  System.out.println("DIV="+R);
	  break;
	  
	  default :  System.out.println("Enter valid number");
	  }
  }while(choice!=0);
  }

  public static void main(String[] args)
  {
	  Calculator C=new Calculator();
	  C.acceptData();
	  C.calculation();
  }

}