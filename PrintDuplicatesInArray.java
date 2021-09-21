package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(arr);

		Set<Integer> intSet = new LinkedHashSet<Integer>();
		Set<Integer> intSet1 = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("The original array is: "+arr[i]);
			boolean add = intSet.add(arr[i]);
			if (add == false) {
				intSet1.add(arr[i]);

			}
		}

		System.out.println("The set elements are: " + intSet);
		System.out.println("The duplicate elements are: " + intSet1);

	}

}
