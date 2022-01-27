package classobjectsprog;
	public class Pen
	{  
	    String name; 
	    int cost; 
	    String color; 
	    public Pen(String name, int cost, String color) 
	    { 
	        this.name = name;  
	        this.cost = cost; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public int getCost() 
	    { 
	        return cost; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Pen is "+ this.getName()+ ".\ncost and color are "+ this.getCost()+ " and "+ this.getColor() + "."); 
	    }
	    public static void main(String[] args) 
	    { 
	        Pen par = new Pen("Parker",150,"black"); 
	        System.out.println(par.toString()); 
	    } 
	}

