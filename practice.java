class B{
 
 	B b= new B();
 
 	public int show(){
      	return (true ? null : 0);
 	}
 
 	public static void main(String[] args)  {
 
        B b= new B();
        b.show();
    }
 
}


// Exaplanation:

// Whenever we create the object of any class constructor will be called first and memory allocated 
//for all non static variables.
// Here  B b= new B(); variable is object and assigned to new object of same class
// B b= new B(); statement leads to recursive execution of constructor will create infinite objects 
//so at run time an exception will be raised.
// Exception in thread "main" java.lang.StackOverflowError
// The common cause for a stack overflow exception  is a bad recursive call. Typically this is caused
// when your recursive functions doesn't have the correct termination condition.
