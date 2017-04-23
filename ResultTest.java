import java.util.Scanner;

public class ResultTest {
	public static void main(String[]args){
		int mark;
		do{
			System.out.println("Enter your marks:");
			Scanner scan = new Scanner (System.in);
			mark = scan.nextInt();
			
			if(mark>=75){
				System.out.println("A");
			}else if(mark>=65 && mark<75){
				System.out.println("B");
			}else if(mark>=45 && mark<65){
				System.out.println("C");
			}else if(mark>=35 && mark<45){
				System.out.println("S");
			}else{
				System.out.println("F");
			}
			System.out.println("Your marks is "+mark);
		
		}while(mark<=100);
	}

}
