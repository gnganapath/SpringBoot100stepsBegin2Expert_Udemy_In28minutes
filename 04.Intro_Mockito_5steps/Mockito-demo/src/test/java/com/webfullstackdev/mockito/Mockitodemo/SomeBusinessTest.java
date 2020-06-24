package com.webfullstackdev.mockito.Mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testFindGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());			
		int result = businessImpl.findGreatesFromAllData();
		assertEquals(24, result);
	}

}


class DataServiceStub implements DataService{
	
	@Override
	public int[] retriveAllData() {
		return new int[] {24,6,15};
	}
}