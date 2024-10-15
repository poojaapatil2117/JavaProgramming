import java.lang.StringBuffer;
class StringBufferClassConstructer 
{
	public static void main(String[] args) 
	{

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hii How are you ";

		
		System.out.println("-----------------------------------------------------------------");
		StringBuffer str =new StringBuffer();
		System.out.println("StringBuffer(): String 1 = "+str);

		StringBuffer str1 =new StringBuffer(s3);
		System.out.println("StringBuffer(String str): String 2 = "+str1);

		StringBuffer str2 = new StringBuffer("Good morning to All Of you ");
		System.out.println("StringBuffer(String str): String 2 = "+str2);

		System.out.println("-----------------------------------------------------------------");

		//String 2:

		System.out.println("                          Append()Method                         ");

		System.out.println("append(boolean b) = "+str2.append(true));
		System.out.println("append(char c) = "+str2.append('p'));
		System.out.println("append(char[] str) = "+str2.append(" Archer InfoTech"));
		System.out.println("-----------------------------------------------------------------");
		StringBuffer str3 = new StringBuffer("Welcome To The New Contry");
		System.out.println("StringBuffer(String str): String 3 = "+str3);
		System.out.println("append(char[] str) = "+str3.append(" Singapur"));
		System.out.println("append(char[] str, int offset, int len) = "+str3.append(" Singapur",0,9));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("append(CharSequence s)= "+str3.append(" 123"));
		System.out.println("append(CharSequence s, int start, int end) = "+str3.append(" first",0,6));
		System.out.println("append(StringBuffer sb)= "+str3.append(str2));
		System.out.println("appendCodePoint(int codePoint) = "+str3.appendCodePoint(21));
		
		System.out.println("=======================================================================");


		StringBuffer str5 = new StringBuffer("Rohit Sharma is an Indian international cricketer ");
		System.out.println("String 5 : "+str5);

		System.out.println("Default Capacity :"+str5.capacity());

		str5.insert(5," Gurunath ");
		System.out.println("String 5 After Insert The String : "+str5);

		str5.setCharAt(0,'M');
		str5.setCharAt(16,'I');
		System.out.println("Set Char :"+str5);
		str5.trimToSize();
		System.out.println("After Trim Capacity:"+str5.capacity());

		System.out.println("Data Of Str5 :"+str5);

		str5.setLength(40);
		System.out.println("SetLenght()1 :"+str);
		str5.setLength(75);
		System.out.println("SetLenght()2 :"+str);
		System.out.println("Now The Capacity :"+str5.capacity());
		str5.trimToSize();
		System.out.println()
		
		



	}
}
