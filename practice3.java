
class A{

 
 	int GetValue()
 	{
        return (true ? null : 0);
 	}


 	public static void main(String[] args)  {
 
   		A obj= new A();

      	obj.GetValue();
 
    }
 
}
