package com.webmobileapps.sb.udemyin28minutes.begin2expert9.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	//impl soring logic
	//impl saerching login
	//impl return the result
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		// TODO Auto-generated constructor stub
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numbersToFind ) {
//		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		System.out.println(sortedNumbers);
		return 3;
	}

}
