class ClassStringConstructers
{
	public static void main(String[] args) 
	{
		String s1="Hello ";
		String s2="Hello ";
		String s3="Good Morning ";

		String s = s1+" How are You ,"+s3;
		System.out.println("The String is : "+s);

		//Is-Equals

		boolean b1=s1.equals(s2);
		System.out.println("s1.equals(s2) "+b1);

		boolean b2 =s1.equals(s3);
		System.out.println("s1.equals(s3) "+b2);

		//---------------------------------------------------

		int len = "good day".length();
		System.out.println("String lenght is : "+len);

		//---------------------------------------------------

		byte b[]={65,66,67,68,69,70,71};
		String str = new String(b);
		System.out.println("The New String is "+str);

		String str1 = new String(b,2,5);
		System.out.println("The Anotther String is "+str1);

		char ch[]={'h','e','l','l','o',' ','h','o','w',' ','a','r','e',' ','y','o','u'};
		String str2 = new String(ch);
		System.out.println("String Str2 : "+str2);

		String str3 = new String(s3);
		System.out.println("The Str3 : "+str3);

		//using charAt()


	}
}
