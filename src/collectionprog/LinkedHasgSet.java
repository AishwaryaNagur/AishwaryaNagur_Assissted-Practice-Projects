package collectionprog;
import java.util.LinkedHashSet;


public class LinkedHasgSet {
public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		LinkedHashSet<String> ll=new LinkedHashSet<String>();
		
		ll.add("d");
		ll.add("c");
		ll.add("b");
				
		System.out.println("LinkedHashset is "+ll);
		System.out.println("Size of LinkedHashset is "+ ll.size());
		
		System.out.println("Does Linkedhashset contains this 'u' element  " + ll.contains("u"));		
		System.out.println("is Linkedhashset empty  " + ll.isEmpty());
		
		
	    ll.clear();
	    System.out.println("get class  " +ll.getClass());
		
	    System.out.println("is Linkedhashset empty  " +ll.isEmpty());	    		
	}
}
