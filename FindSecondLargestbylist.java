package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestbylist {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> secondlargest =new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
		secondlargest.add(data[i]);
	}
		Collections.sort(secondlargest);
		Integer E = secondlargest.get(secondlargest.size()-2);
		System.out.println(E);
	}

}
