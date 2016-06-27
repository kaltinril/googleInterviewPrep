package exampleQuestions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

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
	
	// Print out the grade-school multiplication table up to nxn
	public void multiplicationTableDynamic(int n){
		for(int i=1;i<n+1;i++){
			for (int j=1;j<n+1;j++)
				System.out.printf("%4d", i*j);
			System.out.println();
		}
	}
	
	//
	private void createFileForSumOfInts(int[] numbers, String filename){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
			for(int i = 0; i < numbers.length; i++){
				bw.write(String.valueOf(numbers[i]) );
				bw.newLine();
			}
			bw.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	// Write a function that sums up integers from a text file, one int per line.
	public int sumOfIntsInFile(int[] numbers, String filename){
		createFileForSumOfInts(numbers, filename);
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String s;
			int sumValue = 0;
			while ((s = br.readLine()) != null){
				sumValue += Integer.parseInt(s);
			}
			
			System.out.println("Total from File: " + sumValue);
			
			br.close();
			
			return sumValue;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return 0;
	}
}
