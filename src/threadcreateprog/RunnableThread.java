package threadcreateprog;

public class RunnableThread implements Runnable{
	public void run(){  
	System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[]){  
	
	RunnableThread rt=new RunnableThread();       
	Thread t1 = new Thread(rt);                    
	t1.start();                                     
 }  

}
