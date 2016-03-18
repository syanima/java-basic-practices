class A{

 
	public static void show(){
 
    	System.out.println("Static method called");
 	}
 
 	public static void main(String[] args)  {
 
        A obj=null;
        obj.show();
 
    }
 
}


// Exaplanation:

// We can call static methods using reference variable which is pointing to null because static
// methods are class level so we can either call using class name and reference variable which is
// pointing to null.

