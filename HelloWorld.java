
class HelloWorld 
{ 
    public static void main(String args[]) 
    { 
		String s = "";
		String sb = "";
		if (args.length<1) s="Hello World";
		else s=args[0];
		sb=new StringBuilder(s).reverse().toString() ;

	System.out.println(s); 
	System.out.println(sb); 
    } 
}