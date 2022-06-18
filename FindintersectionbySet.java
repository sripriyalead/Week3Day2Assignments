package week3day2assignment;

import java.util.HashSet;
import java.util.Set;



public class FindintersectionbySet {

	public static void main(String[] args) {
		int arr1[] = {3,2,11,4,6,7};
		Set<Integer> setarr1= new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++)
		{
			setarr1.add(arr1[i]);
		}
		int arr2[] = {1,2,8,4,9,7};
		Set<Integer> setarr2= new HashSet<Integer>();
		for (int j = 0; j < arr2.length; j++)
		{
			setarr2.add(arr2[j]);
		}
		setarr1.retainAll(setarr2);
		System.out.println(setarr1);

	}

	}


