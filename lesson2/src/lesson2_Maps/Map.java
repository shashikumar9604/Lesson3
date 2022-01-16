package lesson2_Maps;



	import java.util.*;
import java.util.Map.Entry;
	public class Map {
	public static void main(String[] args) {
		// map
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		hm.put(1,"sachin"); 
		hm.put(2,"yashwanth"); 
		hm.put(3,"charan"); 
	 
		System.out.println("\nThe elements of Hashmap are "); 
		for(Entry<Integer, String> m:hm.entrySet()){ 
		System.out.println(m.getKey()+" "+m.getValue()); 
	 }
	 
		//HashTable
	 
		 Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		 
		 ht.put(4,"krishna"); 
		 ht.put(5,"Raghu"); 
		 ht.put(6,"Fardden"); 
		 ht.put(7,"seena"); 
		 System.out.println("\nThe elements of HashTable are "); 
		 for(Entry<Integer, String> n:ht.entrySet()){ 
		 System.out.println(n.getKey()+" "+n.getValue()); 
	 }
	 
	 
		 //TreeMap
	 
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
		 map.put(8,"shadow"); 
		 map.put(9,"lepord"); 
		 map.put(10,"lion"); 
	 
		 System.out.println("\nThe elements of TreeMap are "); 
		 for(Entry<Integer, String> l:map.entrySet()){ 
		 System.out.println(l.getKey()+" "+l.getValue()); 
	 } 
	 
	 } 
	}

