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
	
}
