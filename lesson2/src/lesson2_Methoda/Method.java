package lesson2_Methoda;

public class Method {

		
		public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
		}
		public static void main(String[] args) {
		Method b=new Method();
		int ans= b.multipynumbers(20,5);
		System.out.println("Multipilcation is :"+ans);
		}
}


