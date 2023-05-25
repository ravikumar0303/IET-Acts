class SwapService{

	// array of objects 
	public static void swapByRef(Demo d[ ]) /// 0 1 
	{
		Demo temp = null ;

		temp = d[0] ; 

		d[0] = d[1];

		d[1] = temp;

		System.out.println("in side Swap Function");

		d[0].showData();
		d[1].showData();

		System.out.println("\n\n");

	}


	public static void  swap(Demo d1 , Demo d.2){
	
		Demo temp  = null;   // local 

		temp = d1 ; 
	
		d1 = d2 ;
	
		d2 = temp;

		System.out.println("in side Swap Function");

		d1.showData();
		d2.showData();

		System.out.println("\n\n");
		

	}  //  end 





}