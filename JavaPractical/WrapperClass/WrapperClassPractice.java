
class WrapperClassPractice 
{
	public static void main(String[] args) 
	{
		// Byte class fields
		System.out.println("Min Value: "+Byte.MIN_VALUE);
		System.out.println("Min Value: "+Byte.MAX_VALUE);
		System.out.println("Representing primitive type: "+Byte.TYPE);		
		System.out.println("Space Needed in bytes: "+Byte.BYTES);		
		System.out.println("Space Needed in bits: "+Byte.SIZE);

		// Using Byte class constructors
		Byte ob1=new Byte((byte)10);  		
		byte b=10;
		Byte ob2=new Byte(b);      
		Byte ob3=new Byte("123");     
		
		// Converting the value to different primitive type
		System.out.println("byte value: "+ob1.byteValue());
		System.out.println("short value: "+ob1.shortValue());
		System.out.println("int value: "+ob1.intValue());
		System.out.println("long value: "+ob1.longValue());
		float ft=ob1.floatValue();
		System.out.println("float value: "+ft);
		double db=ob1.doubleValue();
		System.out.println("double value: "+db);

		// using public int compareTo(Byte anotherByte)
		// this method returns numeric ans of ob1-ob2/ob3, it is non-zero when
		// objects having different value and zero when objects having same value.
		int t=ob1.compareTo(ob3);
		System.out.println("return value t: "+t);
		t=ob1.compareTo(ob2);
		System.out.println("return value t: "+t);

		// using public boolean equals(Object obj):

		boolean ans=ob1.equals(ob2);
		System.out.println("return value ans: "+ans);

		// equals give true when both reference refering towards samelocation
		// here in this case ans is true coz as the ob1 and ob2 having same value
		// while creating object, in same vaue is there in memory the that location
		// is refered by new reference.
		// if we change the value of ob1 or ob2, then it will gives false.

		// Note: compareTo() compares the numeric values of object and equals()
		//	     compares the references of both objects, means both objects are
		//		 refering towards same ocation or not.

		ans=ob1.equals(ob3);
		System.out.println("return value ans: "+ans);


		// Using Parsing
		String num="120";
		byte n=Byte.parseByte(num);
		System.out.println("byte n: "+n);

		// using toString()
		byte val1=56;
		String s=Byte.toString(val1);		
		System.out.println("String s: "+s);

		String s1=ob3.toString();
		System.out.println("String s1: "+s1);

		// using valueOf()

		byte val2=15;
		Byte ob4=Byte.valueOf(val2);
		System.out.println("ob4 is: "+ob4); // ob4.toString() called internally

		String s2="45";
		Byte ob5=Byte.valueOf(s2);
		System.out.println("ob5 is: "+ob5);

		String nms="1111";
		short no=Short.parseShort(nms,2);
		System.out.println("No: "+no);
	}
}
