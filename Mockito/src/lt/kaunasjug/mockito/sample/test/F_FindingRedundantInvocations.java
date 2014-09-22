package lt.kaunasjug.mockito.sample.test;


import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;
public class F_FindingRedundantInvocations {

	@Test
	public void test(){

		@SuppressWarnings("unchecked")
		List<String> mockedList = mock(List.class);
		//using mocks
		mockedList.add("one");
		mockedList.add("two");
		 
		verify(mockedList).add("one");
		verify(mockedList).add("two");
		//following verification will fail
		verifyNoMoreInteractions(mockedList);
	}
}
