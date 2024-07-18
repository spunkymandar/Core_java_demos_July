package pack1;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		//         0123
		String s2="Java";
		
		if(s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		System.out.println("Total characters available: "+s1.length());
		System.out.println("Character at 1st index: "+s1.charAt(1));
		
	}

}
