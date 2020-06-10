package com.webmobileapps.sb.udemyin28minutes.begin2expert9.springin10steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QucikSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		return numbers;
	}
}