package com.webmobileapps.sb.udemyin28minutes.begin2expert9.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QucikSortAlgorithm());
		
		int result =  binarySearch.binarySearch(new int[] {12,4,5}, 3);
		System.out.println(result);
		
		//SpringApplication.run(Application.class, args);
	}

}
