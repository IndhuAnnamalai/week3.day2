package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> listArray = new ArrayList<Integer>();
		for(int i =0;i<data.length;i++) {
			listArray.add(data[i]);
		}
		Collections.sort(listArray);
		System.out.println("The list array is: "+listArray);
		int size = listArray.size();
		System.out.println("The size of the Array is: " + size);

		int secondLast = size-2;
		System.out.println("The secondLast index of the Array is: " + secondLast);
		System.out.println("The second last element in the list is: " + listArray.get(secondLast));
		
		
	}

}
