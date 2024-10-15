class  ShortWrapperClass
{
	public static void main(String[] args) 
	{
		//ShortWrapperClass Fields :
		System.out.println("ShortWrapperClass Fields :");

		System.out.println("Short-MinValue = "+Short.MIN_VALUE);
		System.out.println("Short-MaxValue = "+Short.MAX_VALUE);
		System.out.println("Short-TYPE = "+Short.TYPE);
		System.out.println("Short-BYTES = "+Short.BYTES);
		System.out.println("Short-Bites = "+Short.SIZE);

		System.out.println("-------------------------------------");

		//Constructers in short

		Short ob1 = new Short((short)10);

		short s = 10;
		Short ob2 = new Short(s);

		Short ob3 = new Short("45");

		//----------------------------------------

		//converting values into Primitive Types
		System.out.println("converting values into Primitive Types :");
		System.out.println("in- byte "+ob1.byteValue());
		System.out.println("in- short "+ob1.shortValue());
		System.out.println("in- int "+ob1.intValue());
		System.out.println("in- double "+ob1.doubleValue());

		float ft = ob1.floatValue();
		System.out.println("in-float "+ft);

		long lg = ob1.longValue();
		System.out.println("in-long "+lg);
		System.out.println("-------------------------------------");

		//Compare to:

		int t = ob1.compareTo(ob2);
		System.out.println("ob1.compareTo(ob2) "+t);

		 t = ob1.compareTo(ob3);
		System.out.println("ob1.compareTo(ob2) "+t);
		


	}
}
