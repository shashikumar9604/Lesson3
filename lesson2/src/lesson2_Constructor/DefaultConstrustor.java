package lesson2_Constructor;

	class EmpInfo
	{
		int id;
		String name;
		void display() 
		{
		System.out.println(id+" "+name);
	    }
	}
	public class DefaultConstrustor 
	{
		public static void main(String[] args) 
		{
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();
		emp1.display();
		emp2.display();
		}
		
    }


