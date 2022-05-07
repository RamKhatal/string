package pkg1;

public class contruct {
	 static int a;
	 static  int b;
	 static int c;
	 static int d;
	public contruct() 
	{
		a=10;
		b=20;
	
	}
	public contruct( int a)
	{
	    int c=40;
		int d=50;

    	System.out.println(c);
		System.out.println(d);
     	
	}

	public static void main(String[] args) {
		        
				contruct k = new contruct();
		        k.demo();
		        new contruct(a);
	}
	     public void demo() {

    	  System.out.println(a);
		  System.out.println(b);

	}
}
