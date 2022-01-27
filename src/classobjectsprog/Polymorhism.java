package classobjectsprog;

public class Polymorhism {
	 protected void disp(int a)
	    {
	         System.out.println(a);
	    }
	    
	    public void disp(int a, long num)  
	    {
	         System.out.println(a + " "+num);
	    }
	    
	    double disp1(int c)
	    {
	       System.out.println(c);
	       return 0;
	    } 

	public class Polymorphism1
	{
	   public static void main(String args[])
	   {
	       Polymorhism obj = new Polymorhism();
	       
	       obj.disp(20);
	       obj.disp(45,10); 
	       obj.disp(5);       
	   }
	}
}
