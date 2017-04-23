public class Child{
	
	int childAge;
	public Child(String name){
		// This constructor has one parameter, name.
		System.out.println("Child's Name is :"+name);
	}
	
	public void setAge( int age ){
	childAge = age;
	} 	
	
    public int getAge(){
	System.out.println("Child's age is :" + childAge);
	return childAge;
	}	
	
		public static void main(String []args){
		/* Object creation */
		Child myChild = new Child("Sam");
		/* Call class method to set kitty's age */
		myChild.setAge(5);
		/* Call another class method to get kitty's age */
		myChild.getAge();
		/* You can access instance variable as follows as well */
		//System.out.println("Variable Value :" + myChild.childAge);
	}
	
		

}
	