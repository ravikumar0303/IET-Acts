class ArrayService {


	public static void displayArrayElements(int a[ ] ){
		
		System.out.println("Whole Array");
		for(int i = 0 ; i<a.length ; i++){

			System.out.println(a[i]);

		}

		System.out.println("\n\n Even index  Array");
		for(int i = 0 ; i<a.length ;i++ ){
			if( i%2 == 0){
			System.out.println(a[i]);
			}

		}



	}

	public static void updateArrayElements(int a[ ] ){
	
		System.out.println("updateArrayElements " ) ;
		for(int i = 0 ; i<a.length ; i++){

			a[i] =  a[i] * 2;  // updating array


		}

	}

	public static void searchArrayElements(int a[ ] , int temp ){
		
		
		for(int i = 0 ; i<a.length ; i++){

			if(a[i] == temp){  //flag

		System.out.println("data is availble at " + i + " location " );

			}
			else { 
		System.out.println("data is not availble  " );
			}

		}

	}


	public static void main (String [ ] args){


		int arr1 [ ] = new int[5] ; // store same type 
		arr1[0]  = 1 ;   arr1[1]  = 2 ;  arr1[2]  = 3 ;
		arr1[3]  = 4 ;  arr1[4]  = 5 ; 


		//  display - iterate   for , for each , modify 
		displayArrayElements(arr1);

		updateArrayElements(arr1);

		displayArrayElements(arr1);

		// search  ---- number  ---- availble , index 
		int  temp = 10 ; 
		searchArrayElements(arr1 ,  temp);

	}





}