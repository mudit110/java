//import java.util.*;
class Test{

	public void display()
	
		{System.out.println("test is displayed");}
	}
	class Testdemo
	
	{public static void main(String args[])
	
	{Test t =null;

	try{
	t.display();
    }
    catch(Exception e)
    
		
	{
	System.out.println(e);
	}
	}
}