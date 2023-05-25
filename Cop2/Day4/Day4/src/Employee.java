
public class Employee {
	int empId ; //  instance 
	
	static int count ;
	
	//block 
	static // single 
	{	System.out.println("inside static block 1");	
		count  = 100; //  static var
		
	}	
	
	// instance block  - per instance 
	
	// method 
	{
		
		System.out.println("starting employee demo");
		
	}
	// static init
	//Constructor instance 
	public Employee(){
			count = count  +1;// 101 -- 102
			empId = count;
	}
	
	
	public static void main(String[] args) {
		 
		System.out.println(e.empId);
		
		Employee e1 = new Employee();
		System.out.println(e1.empId);
		
		Employee e2 = new Employee();
		System.out.println(e2.empId);
	}


}
