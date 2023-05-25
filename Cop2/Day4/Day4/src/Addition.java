
public class Addition {
	//int...i  10  array  0  9- length -1 for , foreach  
public void add(int...i) {
		// addition 
//System.out.println("inside add function " + i.length);
	int sum = 0;  // local  Arrays  length()
	for(int s = 0 ; s < i.length ; s ++ ) {			
		//sum = sum + i[s] ; 	
		sum += i[s];
	}	
System.out.println("Addition of " + i.length + "numbers " + sum);
		
	}
	
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add();
		a.add(1,2);
		a.add(1,2,3,4,5);
		a.add(1,2,3,4,5,6,7);
		
	}

}
