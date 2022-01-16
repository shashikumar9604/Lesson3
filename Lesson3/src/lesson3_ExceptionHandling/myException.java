package lesson3_ExceptionHandling;


	class myException extends Exception{
		 String str1;
		 myException(String str2) {
		str1=str2;
		 }
		 public String toString(){ 
		return ("MyException Occurred: "+str1) ;
		 }
		}
		class ExceptionHandlingDemo{
		 public static void main(String args[]){
		try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new myException("This is My error Message");
		}
		catch(myException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
		}
		 }
		}



