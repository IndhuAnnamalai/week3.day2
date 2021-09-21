package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We learn java basics as part of java sessions in java week1";
		//int count = 0;
		String[] split = str.split(" ");

		List<String> strList = new ArrayList<String>();
		strList.addAll(Arrays.asList(split));

		System.out.println("The string in the list is: " + strList);
		Set<String> strSet = new LinkedHashSet<String>(strList);

		System.out.println("The set after removing duplicates is: " + strSet);
	}

}
