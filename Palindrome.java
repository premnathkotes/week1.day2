package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String wrd="Madam";
		char[] charArray=wrd.toCharArray();
		String rev="";
		for (int i = charArray.length-1; i >= charArray.length-1; i--) 
		{
			rev = rev+charArray[i];
			if (wrd.equals(rev)) 
			{
				System.out.println("Palindrome");}
				else {System.out.println("Not a Palindrome");
				
			}
		}
	}

}
