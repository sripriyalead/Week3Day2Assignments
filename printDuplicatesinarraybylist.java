package week3day2assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class printDuplicatesinarraybylist {

	public static void main(String[] args) {


		//print duplicates in array uisng list
		int[] arraylist = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> unique=new HashSet<Integer>();
		Set<Integer> duplicate=new HashSet<Integer>();
		for (int i=0; i<arraylist.length; i++)
		{
			if(unique.add(arraylist[i])==false) {
				duplicate.add(arraylist[i]);
			}
		}
		System.out.println(duplicate);
	}
}


