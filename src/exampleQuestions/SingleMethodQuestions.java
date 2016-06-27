package exampleQuestions;

// Questions taken from:
// https://sites.google.com/site/steveyegge2/five-essential-phone-screen-questions

public class SingleMethodQuestions {
	
	// Write a function to reverse a string.
	public String reverseString(String forwardString){
		StringBuilder sb = new StringBuilder();
		
		for(int i = forwardString.length()-1; i >= 0; i--){
			sb.append(forwardString.charAt(i));
		}
		
		return sb.toString();
	}
	
	
	// Write a function to reverse a string, swapping positions to loop half
	public String reverseStringSwapArray(String forwardString){
		int length = forwardString.length();
		int last = length - 1;
		char[] reversedString = forwardString.toCharArray();
		
		for(int i = 0; i < length/2; i++){
			char c = reversedString[i];
			reversedString[i] = reversedString[last-i];
			reversedString[i] = c;
		}
		
		return reversedString.toString();
	}
}
