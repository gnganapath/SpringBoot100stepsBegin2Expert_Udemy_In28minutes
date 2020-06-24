package com.webfullstackdev.mockito.Mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class SomeBusinessMockAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void testFindGreatestFromAllData() {
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 24,15,3});					
		assertEquals(24, businessImpl.findGreatesFromAllData());
	}
	
	@Test
	public void testFindGreatestFromAllData_ForNoValues() {

		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});			
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatesFromAllData());
	}

}


