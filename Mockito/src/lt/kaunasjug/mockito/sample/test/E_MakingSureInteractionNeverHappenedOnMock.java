package lt.kaunasjug.mockito.sample.test;

import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class E_MakingSureInteractionNeverHappenedOnMock {

	
	@Test
	public void test() {
		
		    @SuppressWarnings("unchecked")
			List<String> mockOne = mock(List.class);
		    @SuppressWarnings({ "unchecked", "unused" })
			List<String> mockTwo = mock(List.class);
		    @SuppressWarnings("unchecked")
			List<String> mockThree = mock(List.class);
		    
		    
		//using mocks - only mockOne is interacted
			mockOne.add("one");
			 
			//ordinary verification
			verify(mockOne).add("one");
			 
			//verify that method was never called on a mock
			verify(mockOne, never()).add("two");
			 
			//verify that other mocks were not interacted
			verifyZeroInteractions(mockOne, mockThree);
	}
}
