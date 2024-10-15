import java.util.Arrays;
class StringClassMethods 
{
	public static void main(String[] args) 
	{
		String str1="hello";
		String str2="hello";
		String str3="hello,How Are You";

		System.out.println("1.CharAt-Index = "+str3.charAt(4));

		for (int i=0;i<str1.length();i++)
		{
			//System.out.print(str2.charAt(i));
			System.out.println(str2.charAt(i));
		}
		//System.out.println();
		System.out.println("------------------------------------------------------------------");

		System.out.println("2.codePointAt(int index) = "+str3.codePointAt(10));	//ASSCI Value or UNICODE
		System.out.println("3.codePointBefore(int index) = "+str3.codePointBefore(10));
		System.out.println("4.codePointCount(int beginIndex, int endIndex) = "+str3.codePointCount(4,10));
		System.out.println("------------------------------------------------------------------");


		System.out.println("5.compareTo(String anotherString) = "+str3.compareTo(str1));
		System.out.println("5.compareTo(String anotherString) = "+str2.compareTo(str1));
		System.out.println("------------------------------------------------------------------");


		System.out.println("6.compareToIgnoreCase(String str) = "+str2.compareTo(str1));
		System.out.println("6.compareToIgnoreCase(String str) = "+str3.compareTo(str1));
		System.out.println("6.compareToIgnoreCase(String str) = "+str1.compareTo(str3));
		System.out.println("------------------------------------------------------------------");


		System.out.println("7.concat(String str) = "+"Good morning to All of You.".concat(str3));
		System.out.println("7.concat(String str) = "+str1.concat(str3));
		System.out.println("------------------------------------------------------------------");


		System.out.println("8.toUpperCase()= "+str3.toUpperCase());
		System.out.println("8.toUpperCase()= "+str3.toLowerCase());
		String str4 = "         hello  hii        " ;
		System.out.println("8.trim()= "+str4.trim());
		System.out.println("------------------------------------------------------------------");

		System.out.println("9.substring(int beginIndex) = "+str3.substring(2));		
		System.out.println("9.substring(int beginIndex, int endIndex) = "+str3.substring(3,15));
		System.out.println("------------------------------------------------------------------");


		System.out.println("10.subSequence(int beginIndex, int endIndex) = "+str3.subSequence(2,15));
		System.out.println("------------------------------------------------------------------");


		System.out.println("11.startsWith(String prefix, int toffset) = "+str3.startsWith("h",15));
		System.out.println("11.startsWith(String prefix, int toffset) = "+str3.startsWith("h",0));
		System.out.println("11.startsWith(String prefix) = "+str3.startsWith("h"));
		System.out.println("11.startsWith(String prefix) = "+str3.startsWith("l"));
		System.out.println("------------------------------------------------------------------");

		
		System.out.println("12.endsWith(String prefix) = "+str3.endsWith("l"));
		System.out.println("12.endsWith(String prefix) = "+str3.endsWith("u"));
		System.out.println("------------------------------------------------------------------");
	

		System.out.println("13.indexOf(String index) = "+str3.indexOf("o"));
		System.out.println("13.indexOf(int ch, int fromIndex)= "+str3.indexOf('0',4));
		System.out.println("13.indexOf(int index) = "+str3.indexOf('A'));
		System.out.println("14.lastIndexOf(int index) = "+str3.lastIndexOf('o'));
		System.out.println("------------------------------------------------------------------");

		System.out.println("15.replace(char oldChar, char newChar) = "+str3.replace('h','p'));
		System.out.println("15.replaceAll(String regex, String replacement) = "+str3.replaceAll("How","Pooja"));
		System.out.println("15.replaceFirst(String regex, String replacement) = "+str3.replaceFirst("o","W"));
		System.out.println("------------------------------------------------------------------");


		byte b[]=str3.getBytes();
		System.out.println("The byte Convertion"+Arrays.toString(b));
	}
}
