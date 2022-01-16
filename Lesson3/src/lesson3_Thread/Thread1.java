package lesson3_Thread;
public class Thread1 extends Thread
{
	public void run()
	{
	 System.out.println("concurrent thread started running..");
	}
	public static void main( String args[] )
	{
	 Thread1 thread = new Thread1();
	 thread.start();
    }
}





