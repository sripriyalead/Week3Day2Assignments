package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Missingnumberbyset {

	public static void main(String[] args) {
		int[] number= {4,6,7,2,3,1,9,10,8,8,6,2};
		Set<Integer> set1=new HashSet<Integer>();
		for (int i=0; i<number.length;i++)
		{set1.add(number[i]);
		}
		System.out.println(set1);
		ArrayList<Integer> array1 =new ArrayList<Integer>(set1);
		for (int j=0; j<array1.size(); j++)
		{ 
			if(array1.get(j+1)!=(array1.get(j)+1))
			{
				System.out.println(array1.get(j)+1);
				break;
			}
		}
		}

	}


