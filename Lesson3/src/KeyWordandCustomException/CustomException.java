package KeyWordandCustomException;


	class MyException extends Exception 
	{ 
	 public MyException(String s) 
	 { 
	 super(s); 
	 } 
	} 
	public class CustomException 
	{ 
	 public static void main(String args[]) 
	 { 
	 try
	 { 
	 throw new MyException("welcome to mphasis"); 
	 } 
	 catch (MyException ex) 
	 { 
	 System.out.println("hi"); 
	 System.out.println(ex.getMessage()); 
	 } 
	 } 
	}



