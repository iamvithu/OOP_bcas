import java.util.Scanner;

public class UserCalculation {

	public static void main(String[] args) {
		int x, y;

		Scanner scan = new Scanner(System.in);
		{
			System.out.println("Enter the first number:");
			String num1 = scan.next();
			System.out.println("Enter the second number:");
			String num2 = scan.next();
			System.out.println("Enter the operator (+,-,*,/,%):");
			String operator = scan.next();

			x = Integer.parseInt(num1);
			y = Integer.parseInt(num2);
			System.out.println(num1 + operator + num2);
		}
	}
}
