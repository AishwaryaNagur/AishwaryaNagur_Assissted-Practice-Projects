package threadcreateprog;

public class ThreadCreate extends Thread 
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		ThreadCreate tc = new ThreadCreate();
	  		tc.start();
	 	}

	}

