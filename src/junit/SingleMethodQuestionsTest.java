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
	
	
}
