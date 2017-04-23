public class AddNumbers{
int total;

public void AddNumber(int x,int y){
	total =x+y;
	System.out.println("Total of "+x+"and"+y+"is"+total);
}

public static void main(String[]args){
	AddNumber myAddNumber = new AddNumber();
}
}