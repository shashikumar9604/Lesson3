package array;

public class array {
		public static void main(String[] args) {
		//single-dimensional array
		int a[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}
		//multidimensional array
		int[][] b = {
		 {20, 40, 60, 80,60}, 
		 {30, 60, 90,100},
		 {30,40,60,80,75}};
		 
		 System.out.println("\nLength of row 1: " + b[0].length);
		 }
		}


