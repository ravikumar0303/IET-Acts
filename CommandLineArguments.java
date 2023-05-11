
 class CommandLineArguments {
public static void displayArray(String [] args)
{
	System.out.println("In displayArray");
}
public static void main(String [] args)
{
	displayArray(args);
	System.out.println("length: " + args.length);
	for(int i=0; i<args.length; i++)
	{
		System.out.println(args[i]);
	}
	for(int i=0; i<args.length; i++)
	{
		System.out.println(Integer.parseInt(args[i]));
	}
	for(String s:args)
	{
		System.out.println(s);
	}
}
 }
