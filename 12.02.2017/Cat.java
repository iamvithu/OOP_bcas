public class Cat{
	public Cat(String name){
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :"+name);
		
	}
	public Cat(String name1,String name2){
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :"+name1);
		System.out.println("Passed Name is :"+name2);
		
	}
	
	    public static void main (String []args){
		// Following statement would create an object myCat
		Cat myCat = new  Cat("Jerry");	
		Cat myCats = new  Cat("Kitty,Tom");	
		
	}
	
}
