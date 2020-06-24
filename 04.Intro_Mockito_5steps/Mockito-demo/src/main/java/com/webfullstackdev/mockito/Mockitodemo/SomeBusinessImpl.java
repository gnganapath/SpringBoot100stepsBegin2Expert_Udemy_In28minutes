package com.webfullstackdev.mockito.Mockitodemo;

public class SomeBusinessImpl {
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	
	int findGreatesFromAllData() {
		int[] data = dataService.retriveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for(int value: data) {
			greatest = value;
		}
		return greatest;
	}
}

