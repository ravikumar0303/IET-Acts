 	class Test{

	public static void main(String [ ] args){
	

		Demo a1 = new Demo(11);
		Demo a2 = new Demo(22);

		System.out.println("Before  Swap Function");

		a1.showData();  // 11
		a2.showData();  // 22 
		System.out.println("\n\n");

		SwapService.swap(a , a2);  // by value  copy 

		// a1  - d1    , a2  - d2 


		System.out.println("After Swap Function");

		a1.showData();  // 22
		a2.showData();  // 11



		// Array  - Heap , Objects 

		// a stack a[0] ,  a[1] 
		Demo a [  ] = new Demo [2];

		a[0] = new Demo(33);
		a[1] = new Demo(44);

		System.out.println("Before  Swap Function");

		a[0].showData();  // 33
		a[1].showData();  //44
		System.out.println("\n\n");

		SwapService.swapByRef(a);  // 


		System.out.println("After Swap Function");

		a[0].showData();  // 44
		a[1].showData();  // 33 

		System.out.println("\n\n");











	}


}