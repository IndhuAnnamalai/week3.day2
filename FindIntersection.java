package week3.day2;

import java.util.ArrayList;

import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> intList1 = new ArrayList<Integer>();
		List<Integer> intList2 = new ArrayList<Integer>();

		for (int i = 0; i < array1.length; i++) {
			intList1.add(array1[i]);
		}

		System.out.println("The list1 value is: " + intList1);
		for(int j =0;j<array2.length;j++) {
			intList2.add(array2[j]);
		}
		System.out.println("The list2 value is: " + intList2);
		intList1.retainAll(intList2);
		System.out.println("The final list is: "+intList1);
	}

}
