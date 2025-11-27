package module1programs;

import java.util.Arrays;

public class AnagramArray {

	

			public static void main(String[] args) {
				
				String s1="adsf";
				String s2="pfst";
				
				if (s1.length()!=s2.length())
				{
					
					System.out.println("is not anagram");
				}
				
				else
				{
					char[]c1=s1.toCharArray();
					char[]c2=s2.toCharArray();

					System.out.println("before");
					System.out.println(Arrays.toString(c1));

					System.out.println(Arrays.toString(c2));

					System.out.println("after");

					Arrays.sort(c1);
					Arrays.sort(c2);

					System.out.println(Arrays.toString(c1));
					System.out.println(Arrays.toString(c2));
					
					if (Arrays.equals(c1, c2))
					{
						System.out.println("is anagram");
						
					}
					else
					{System.out.println("is not anagram");}
				}
				

			}

		}




