package edu.bcas.shape.copy;

import java.util.Scanner;

public class Shapes {
public static void main(String[] args) {
		
		int cho;
		int circle;
		int sq;
		int tri;
		int rct;
	
		do{
			System.out.println("Enter choice for shape:");
			Scanner scan = new Scanner (System.in);
			cho = scan.nextInt();
			
			if(cho==1){
				System.out.println("Enter the radious of the circle" +circle);
			}else if(cho==2){
				System.out.println("Enter the one side length" +sq);
			}else if(cho==3){
				System.out.println("Enter the base of the triangle" +tri);
				System.out.println("Enter the height of the triangle" +tri);
			}else if(cho==4){
				System.out.println("Enter the width" +rct);
				System.out.println("Enter the height" +rct);
			}
		
		
}
}
