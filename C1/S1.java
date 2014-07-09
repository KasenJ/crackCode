/*
Solution for crack code interview book
Chap 1---1.1
describe:
	determine if a string has all unique characters
Soluction:
	make a set for 256 char;
	if one char has been check,make it's value ture
*/

public class S1
{
	public static void main(String arg[])
	{
		String str = "I sda";
		S1 test = new S1();
		System.out.println(test.isUniqueChars2(str));
	}

	public boolean isUniqueChars2(String str)
	{
		boolean[] charset = new boolean[256];
		for(int i =0 ;i < str.length();++i)
		{
			int charval = str.charAt(i);
			if(charset[charval])	return false;
			charset[charval] = true;
		}
		return true;
	}
}