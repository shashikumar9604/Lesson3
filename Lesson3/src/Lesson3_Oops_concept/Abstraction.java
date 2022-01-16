package Lesson3_Oops_concept;

public class Abstraction {


		public static void main(String[] args) {
			
//			Human human = new Human();//Can't do it now : abstract
			
			SHADOW Shadow = new SHADOW();
			
			Shadow.eat();
			Shadow.run();
			Shadow.breathe();
			
			shashi shasi = new shashi();
			shasi.eat();
			shasi.run();
			
		}

	}

	abstract class Human{
		abstract void eat();
		abstract void run();
		
		void breathe() {
			System.out.println("Generic breathe...");
		}
	}

	class SHADOW extends Human{
		@Override
		void eat() {
			System.out.println("Shadow own way of eating...");
			
		}
		
		@Override
		void run() {
			System.out.println("Shadow distinguished style of running....");
			
		}
	}

	class shashi extends Human{
		@Override
		void eat() {
			System.out.println("Shashi's eat...");
			
		}
		
		@Override
		void run() {
			System.out.println("Shashi runs fast...");
			
		}
	}



