package lt.kaunasjug.mockito.sample.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;

public class A_FirstMock {

	@Test
	public void test() {
			//mock creation
			@SuppressWarnings("unchecked")
			List<String> mockedList = mock(List.class);
			 
			//using mock object
			mockedList.add("one");
			mockedList.clear();
			 
			//verification
			

			verify(mockedList).clear();

			verify(mockedList).add("one");
			
			verify(mockedList).add("Two");

	}

}
