package com.nt.tasks;

import java.util.Arrays;

public class Assign06_FindingMin_MaxElements {

	public static void main(String[] args) {
		int[] input = { 2, 3, 4, 5, 6, 16, 7, 1, 9, 10, 15, };

		int max = input[0]; // 2
		int min = input[0];
//To Find Max Element in Given array
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		System.out.println("Max Element in Array:::" + max);
//To Find Min Element in Given Array
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
					min=input[i];
			}
		}
		System.out.println("Min Element in Array:::" + min);
	}
}
