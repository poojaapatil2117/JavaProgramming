class ByteWrapperDemo 
{
	public static void main(String[] args) 
	{
		//Byte Class fields
		System.out.println("-------BYTE CLASS FEILDS-------");
		System.out.println("Min Value Of Byte 'Byte.MIN_VALUE' = "+Byte.MIN_VALUE);
		System.out.println("Max Value Of Byte 'Byte.MAX_VALUE' = "+Byte.MAX_VALUE);
		System.out.println("Type Of Byte 'Byte.TYPE' = "+Byte.TYPE);
		System.out.println("Size Of Byte in BYTES 'Byte.BYTES' = "+Byte.BYTES);
		System.out.println("Size of Byte in bits 'Byte.SIZE' = "+Byte.SIZE);
		System.out.println("-------------------------------------------------");

		//--------------------------------------
		//using Byte Class Constructer..

		Byte ob = new Byte((byte)10);

		byte b = 10;
		Byte ob2 = new Byte(b);

		Byte ob3 = new Byte("123");

		//---------------------------------
		//Converting The Value in diffrent Primitve Types

		System.out.println("***Converting The Value In Diffrent Primitve Types***");

		System.out.println("in-Byte "+ob.byteValue());
		System.out.println("in-Short "+ob.shortValue());
		System.out.println("in-Int "+ob.intValue());
		System.out.println("in long "+ob.longValue());

		float ft = ob.floatValue();
		System.out.println("in FLoat "+ft);

		double db = ob.doubleValue();
		System.out.println("in-Double "+db);

		System.out.println("-------------------------------------------------");

		//-----------------------------------------

		/// using public int compareTo(Byte anotherByte)

		System.out.println("***using public int compareTo(Byte anotherByte)***");

		int t= ob.compareTo(ob2);
		System.out.println("ob.compareTo(ob2) "+t);

		t=ob.compareTo(ob3);
		System.out.println("ob.compareTo(ob3) "+t);

		System.out.println("-------------------------------------------------");

		//--------------------------------------------------

		// using public boolean equals(Object obj):

		System.out.println("***using public boolean equals(Object obj***");

		boolean ans = ob.equals(ob2);
		System.out.println("ob.equals(ob2) "+ans);

		ans = ob.equals(ob3);
		System.out.println(" ob.equals(ob3) "+ans);

		System.out.println("-------------------------------------------------");

		//----------------------------------------------

		// Using Parsing

		System.out.println("***Using Parsing***");

		String s= "123";
		byte n = Byte.parseByte(s);
		System.out.println("byte n = "+n);

		//using toString()

		byte b1 = 12;
		String s1= Byte.toString(b1);
		System.out.println("to Sting :"+s1);

		//using Valueof

		byte val1=45;
		Byte vals = Byte.valueOf(val1);
		System.out.println("Byte.valueOf(val1) "+vals);

		String val2="24";
		Byte valb = Byte.valueOf(val2);
		System.out.println("Byte.valueOf(val2)"+valb);
	}
}
