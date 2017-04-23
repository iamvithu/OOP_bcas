public class Calculator{
	int num1=30;
	int num2=20;
	public Calculator(){
		// this constructor has one parameter,
		//System.out.println("value is");
	}	
	public int add(int a, int b){
		return a+b;
	}
	
	public int mul(int a, int b){
		return a*b;
	}
	
	public int div(int a, int b){
		return a/b;
	}
	
	public int mod(int a, int b){
		return a%b;
	}
	
	static void sub(int a, int b){
		System.out.println("sub value is: "+(a-b));
	}
	
	
	public static void main(String []args){
	Calculator total=new Calculator();
	System.out.println("Total value is: "+total.add(30,20));
	System.out.println("Multiple value is: "+total.mul(30,20));
	System.out.println("Divide value is: "+total.div(30,20));
	System.out.println("Mod value is: "+total.mod(30,20));
	sub(30,20);
	}
	}