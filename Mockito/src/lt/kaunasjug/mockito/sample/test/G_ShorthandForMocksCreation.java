package lt.kaunasjug.mockito.sample.test;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class G_ShorthandForMocksCreation {

	@Mock List<String> mockedList;
	
//@Before
    public void before(){
    	MockitoAnnotations.initMocks(this);
    } 
	
	@Test
	public void test(){

		//using mocks
		mockedList.add("one");
		 
		verify(mockedList).add("one");	 
		
	}
}




















//@RunWith( MockitoJUnitRunner.class)