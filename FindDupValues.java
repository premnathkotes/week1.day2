package week1.day2;

import java.util.Arrays;

public class FindDupValues {

	public static void main(String[] args) {

		int[] values = {2,18,18,6,17,17};
		int length = values.length;
		Arrays.sort(values);
		for (int i = 0; i < values.length-1; i++) {
			if (values[i]==values[i+1]) {
				System.out.println("Duplicate values are " + values[i]);
				
			}
			//for (int j = i+1; j < values.length; j++) {
						
				//if (values[i]==values[j]) {
					//System.out.println(values[i]);
				}
				
			}
		
	}


