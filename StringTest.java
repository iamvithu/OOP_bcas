
public class StringTest {
	public static void main(String[]args){
		String name = "BCAS";
		
		System.out.println(name);
		
		/**
		 * Print String
		 */
		
		String note ="National trust bank of Ceylon PLC (CBC) is a Sri Lankan multinational banking and financial services company."
				+"The bank has an operation in Bangladesh.";
		System.out.println(note);
		System.out.println("Index @2 is :" + note.charAt(2));
		
		/**
		 * Copy value of
		 */
		
		char [] nameArray = new char[4];
		nameArray[0]='B';
		nameArray[1]='C';
		nameArray[2]='A';
		nameArray[3]='S';
		
		String insName=" ";
		System.out.println(insName.copyValueOf(nameArray));
		
		/*
		 * hashcode
		 */
		
		String hash ="BCAS";
		System.out.println(hash.hashCode());
		
		/*
		 * length
		 */
		
		String len ="BCAS";
		System.out.println(len.length());
		
		/**
		 * Concat string
		 */
		
		String firstName = "Vithushan";
		String lastName = "Yogeswaranathan  ";
		String space = " ";
		String fullName = firstName.concat(space).concat(lastName);
		
		System.out.println("Your full name is:"+fullName);
		
		/**
		 * Lower case,Upper case
		 */
		
		String campus = "BCAS Jaffna Campus";
		System.out.println(campus.toLowerCase());
		System.out.println(campus.toUpperCase());
		
		/**
		 * String trim
		 */
		 
		String ins = "                      BCAS Jaffna Campus";
		System.out.println(ins);
		/**System.out.println(ins.trim());*/
		
		
		//String collage = "BCAS Jaffna Campus";
		//System.out.println(collage.());
		
		
	}

}
