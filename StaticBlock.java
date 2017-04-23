
public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("Main method is executed.");
	}

	/**
	 * Static block is executed before main method
	 */
	static {
		System.out.println("Static block is executed before main method");
	}

	static {
		System.out.println("Static block is executed before main method2");
	}

}
