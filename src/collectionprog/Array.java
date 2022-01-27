package collectionprog;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
public static void main(String[] args){
		
		ArrayList<String> al=new ArrayList<String>();  
		
		System.out.println("Initial size of Arraylist is "+ al.size());  
		
		al.add("Hi");
		al.add("Guys");
		System.out.println("Arraylist is "+al);
		System.out.println("New size of Arraylist is "+al.size()); 
		
		
		
		al.add(1,"Welcome");
		System.out.println("New Arraylist is "+al);
		System.out.println("New size of Arraylist is "+al.size());
		
		System.out.println("element at position 1 is  : "+ al.get(1)); 
	
		Collections.reverse(al);   
		System.out.println("Reversed arraylist is : "+ al);   
	
		al.set(2, "How are you"); 
        System.out.println("ArrayList after setting/replacing element at position 2 is : " + al);
        
        al.remove(2);
        System.out.println("New Arraylist is "+al);
        
        al.remove("Guys");
        System.out.println("New Arraylist is "+al);
        
        System.out.println(al.contains("guys"));
       
        
        
        
	}

}
