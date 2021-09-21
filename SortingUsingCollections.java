package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"HCl","Wipro","Aspire Systems","CTS"};
		List<String> strList = new ArrayList<String>();
		strList.addAll(Arrays.asList(str));
		
		Collections.sort(strList);
		System.out.println("The sorted array is: "+ strList);
		
		Collections.reverse(strList);
		System.out.println("The reversed array is: " + strList);
		
	}

}
