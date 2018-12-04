
class HelloWorld 
{ 
    public static void main(String args[]) 
    { 
		String s = "";
		if (args.length<1) s="Hello World";
		else s=args[0];

	System.out.println(s); 
    } 
}