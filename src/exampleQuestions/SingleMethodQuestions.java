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
}
