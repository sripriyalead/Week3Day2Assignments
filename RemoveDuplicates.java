package week3day2assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textsplit=text.split(" ");
		//int count;
		//char[] arraytext=text.toCharArray();
		Set<String> settext=new HashSet<String>();
		for (int i=0; i<textsplit.length; i++)
		{
			if(settext.contains(textsplit[i]))
			{settext.remove(textsplit[i]);
			}else
			{settext.add(textsplit[i]);
			}
			}
		
		
		System.out.println(settext);

	}

}
