// n  numbers   int String addition 

//Integer.parseInt()    // Arrays heap new 



class CommandLineArguments {


	public static void displayArray(String [ ]  a)
	{
		System.out.println(" in displayArray");
	}

	public static void main(String [] args)   //local 	

	{
		displayArray(args);

		displayArray(new String[] {"a" , "b"});  // array   1 d  , 2d
	

		System.out.println("length  : " + args.length);

		//for(int i = 0  ; i < args.length ; i++)
		//{// String 
		//	System.out.println(args [ i ]);
		//}

		for(int i = 0  ; i < args.length ; i++)
		{// int 
			System.out.println(Integer.parseInt(args [ i ]));
		}
	
		//for(String  s : args)  // last index 
		//{
		//	System.out.println(s);
		//}
		


	}

}


