package enumcontructor;

public enum Color {
	
	RED, GREEN, BLUE;
	
	// constructor
	private Color() {
		System.out.println("Constructor called for: " + this.toString());
	}
	
	public void colorInfo() {
		System.out.println("Universal color");
	}

}
