import java.util.Scanner;
public class Testing {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);{
			System.out.println("Type your first name:");
			String firstname = scan.next();
			System.out.println("Type your second name:");
			String secondname = scan.next();
			System.out.println("Type your age:");
			int age = scan.nextInt();
			System.out.println("Your first name is  " + firstname + "  Your second name is  " + secondname + "  Your age is  " + age);
			
		}

	}

}

