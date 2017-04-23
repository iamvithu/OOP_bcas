import java.util.Scanner;

public class NumberGuess {
	public static void main(String[]args){
		int x;
		
		System.out.println("Enter the guessing number:");
		Scanner scan = new Scanner (System.in);
		x = scan.nextInt();
		
		double result = Math.random()*x;
		System.out.println("Random number is "+ result);
		
		if(x==result){
			System.out.println("You are the winner");
		}
		else{
			System.out.println("You are the lozer");
		}
		
	}
}
