package innerclassprog;

public class InnerClass {
 private String msg="HELLO EVERYONE"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Welcome To Hello World ");}  
	 }  


	public static void main(String[] args) {

		InnerClass obj=new InnerClass();
		InnerClass.Inner in=obj.new Inner();  
		in.hello();  
	}
}

