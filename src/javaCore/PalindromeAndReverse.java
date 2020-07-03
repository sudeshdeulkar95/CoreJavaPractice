package javaCore;

public class PalindromeAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nonPalindrome = "Sudesh";
		String myString = "";
		
		for(int i=nonPalindrome.length()-1;i>=0;i--){
			myString = myString + nonPalindrome.charAt(i);
		}
		
		System.out.println(myString);
		
		if(myString.equals(nonPalindrome)){
			System.out.print("It is a palindrome");
		}	
	}
}
	
