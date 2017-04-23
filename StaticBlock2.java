
public class StaticBlock2 {

	public static void main(String[] args) {
		System.out.println("You are using Windows_NT operating syatem.");
	}

	static {
		System.out.println(System.getenv("USERNAME"));
		System.out.println(System.getProperties());

		String os = System.getenv("OS");
		System.out.println("OS :" + os);

		if (os.equals("Windows_NT") != true) {
			System.exit(1);
		}

		/**
		 * System.out.println("NUMBER_OF_PROCESSORS : "+
		 * System.getenv("NUMBER_OF_PROCESSORS")); System.out.println("USERNAME
		 * : "+ System.getenv("USERNAME"));
		 * 
		 * System.out.println(System.getProperties());
		 * System.out.println(System.getProperty("sun.boot.library.path");
		 */
	}
}
