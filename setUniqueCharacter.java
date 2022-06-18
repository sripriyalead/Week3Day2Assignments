package week3day2assignment;

import java.util.HashSet;
import java.util.Set;

public class setUniqueCharacter {

	public static void main(String[] args) {

		//print only unique characters form input:babu, o/p=a u
		String str ="babu";
		char[] allchars =str.toCharArray();
		System.out.println(allchars);
		Set<Character> unique=new HashSet<Character>();
		//System.out.println(unique.size());
		for (int i=0; i<allchars.length; i++)
		{
			if(unique.contains(allchars[i]))
			{unique.remove(allchars[i]);
			}else
			{unique.add(allchars[i]);}
		}
		System.out.println(unique);
	}
}


