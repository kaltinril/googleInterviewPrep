package junit;

import static org.junit.Assert.*;
import org.junit.Test;
import exampleQuestions.SingleMethodQuestions;

public class SingleMethodQuestionsTest {
	
	@Test
	public void reverseStringTest(){
		String fws = "forward";
		SingleMethodQuestions smq = new SingleMethodQuestions();
		
		assertEquals(smq.reverseString(fws), "drawrof");
	}
	
	@Test
	public void reverseStringSwapArrayTestOdd(){
		String fws = "forward";
		SingleMethodQuestions smq = new SingleMethodQuestions();
		
		assertEquals(smq.reverseString(fws), "drawrof");
	}
	
	@Test
	public void reverseStringSwapArrayTestEven(){
		String fws = "forwards";
		SingleMethodQuestions smq = new SingleMethodQuestions();
		
		assertEquals(smq.reverseString(fws), "sdrawrof");
	}
	
	@Test
	public void computeNthFiboAddingTest(){
		int n = 25;
		SingleMethodQuestions smq = new SingleMethodQuestions();
		System.out.println(smq.computeNthFiboAdding(n));
		assertEquals(smq.computeNthFiboAdding(n), 75025);
	}
	
	@Test
	public void computeNthFiboRecursiveTest(){
		int n = 25;
		SingleMethodQuestions smq = new SingleMethodQuestions();
		System.out.println(smq.computerNthFiboRecursive(n));
		assertEquals(smq.computerNthFiboRecursive(n), 75025);
	}
	
	@Test
	public void multiplicationTableSimpleTest(){
		SingleMethodQuestions smq = new SingleMethodQuestions();
		smq.multiplicationTableSimple();
		assertEquals(1,1);
	}
	
	@Test
	public void multiplicationTableDynamicTest(){
		SingleMethodQuestions smq = new SingleMethodQuestions();
		smq.multiplicationTableDynamic(12);
		assertEquals(1,1);
	}
	
	@Test
	public void sumOfIntsInFileTest(){
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		int answer = 55;
		SingleMethodQuestions smq = new SingleMethodQuestions();
		
		assertEquals(smq.sumOfIntsInFile(values, "fakefile"), answer);
	}
	
	@Test
	public void addOddNumbersUntilTest(){
		SingleMethodQuestions smq = new SingleMethodQuestions();
		smq.addOddNumbersUntil(99);
		
		assertEquals(1,1);
	}
	
	
	@Test
	public void largestIntTest(){
		int[] values = {-6814684,2,0,4,5,68496,7,8,9,50,-555, 112558};
		SingleMethodQuestions smq = new SingleMethodQuestions();
		
		assertEquals(smq.largestInt(values), 112558);
	}
	
	@Test
	public void rgb2HexTest(){
		SingleMethodQuestions smq = new SingleMethodQuestions();
		assertEquals("ff007f", smq.rbg2Hex(255, 0, 127));
	}
	
}
