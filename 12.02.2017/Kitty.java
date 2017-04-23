public class Kitty{
	
	int kittyAge;
	public Kitty(String name){
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :"+name);
	}
	
	    public void setAge( int age ){
		kittyAge = age;
		} 	
	
    public int getAge(){
		System.out.println("Kitty's age is :" + kittyAge);
		return kittyAge;
	}	
	
	public static void main(String []args){
		/* Object creation */
		Kitty myKitty = new Kitty("jerry");
		/* Call class method to set kitty's age */
		myKitty.setAge(1);
		/* Call another class method to get kitty's age */
		myKitty.getAge();
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myKitty.kittyAge);
	}
	
		

}
