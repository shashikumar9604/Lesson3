package Collection;

	import java.util.*;
	public class Collection
	  {
	public static void main(String[] args) 
	    {
		  //creating array-list
	      System.out.println("ArrayList");
	      ArrayList<String> city=new ArrayList<String>(); 
	      city.add("pune ");//
	      city.add("Bangalore"); 
	      System.out.println(city); 
	      
	      //creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(150); 
	      vec.addElement(301); 
	      System.out.println(vec);
	      
	      //creating linked-list
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>(); 
	      names.add("shashi"); 
	      names.add("kumar"); 
	      names.add("vinay"); 
	      names.add("adrash"); 
	      
	      Iterator<String> itr=names.iterator(); 
	      while(itr.hasNext()){ 
	      System.out.println(itr.next()); 
	 
	      //creating hash-set
	      System.out.println("\n");
	      System.out.println("HashSet");
	      HashSet<Integer> set=new HashSet<Integer>(); 
	      set.add(208); 
	      set.add(203); 
	      set.add(206);
	      set.add(208);
	      System.out.println(set);
	 
	      //creating linked-hash-set
	      System.out.println("\n");
	      System.out.println("LinkedHashSet");
	      LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>(); 
	      set2.add(21); 
	      set2.add(23); 
	      set2.add(22);
	      set2.add(24); 
	      System.out.println(set2);
	      } 
	   } 
	}



