package modifiersprog;

public class AccessModifier2 {
	public static void main(String args[]) {
		new AccessModifiers().methodPublic();
		new AccessModifiers().methodProtected();
		new AccessModifiers().methodDefault(); 
		System.out.println("Value of long"+ new AccessModifiers().k);		
	}

	public void methodPublic() {
		System.out.println("AccessModifier2: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("AccessModifier2: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("AccessModifier2: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("AccessModifier2: methodPrivate");
	}

}
