package com.webmobileapps.sb.udemyin28minutes.begin2expert9.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result =  binarySearch.binarySearch(new int[] {12,4,5}, 3);
		System.out.println(result);
		
		//
	}

}
