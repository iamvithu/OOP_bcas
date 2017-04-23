public class Boy{
	
	public Boy(String name){
		// This constructor has one parameter, name.
		System.out.println("Student Name is :"+name);
	}
	
	public Boy(String name1,String name2,String name3){
		// This constructor has one parameter, name.
		System.out.println("Students Names are :"+name1);
		System.out.println("Students Names are :"+name2);
		System.out.println("Students Names are :"+name3);
	}
	    public static void main (String []args){
		// Following statement would create an object ourBoy
		Boy ourBoy = new Boy("Vithushan");	
		Boy ourBoys = new Boy("Suhinsan,Jefrin,Sanushan");
	}
	
		

}
