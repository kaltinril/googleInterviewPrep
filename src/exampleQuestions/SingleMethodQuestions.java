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
	
	// Write function to compute Nth Fibonacci number: additive
	public int computeNthFiboAdding(int n){
		if (n < 2) 
			return n;		// Incorporate n being 0 position.

		int last = 1;
		int second = 1;
		int current = 2;
		for (int i = 3; i< n;i++){
			last = second;
			second = current;
			current = last + second;
		}
		
		return current;
	}
	// Write function to compute Nth Fibonacci number: recursive
	public int computerNthFiboRecursive(int n){
		if (n < 2)
			return n;
		
		return computerNthFiboRecursive(n-1) + computerNthFiboRecursive(n-2);
	}
	
	// Print out the grade-school multiplication table up to 12x12
	public void multiplicationTableSimple(){
		for(int i=1;i<13;i++){
			System.out.println(" " + (1*i) + " " + (2*i) + " " + (3*i) + " " + (4*i) + " " + (5*i) + " " + (6*i) + 
					" " + (7*i) + " " + (8*i) + " " + (9*i) + " " + (10*i) + " " + (11*i) + " " + (12*i) );
		}
	}
	
}
