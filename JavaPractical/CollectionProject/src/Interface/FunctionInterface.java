package Interface;
/*
@FunctionalInterface
interface Message
{
	void Printmessage();
}
class Mymessage implements Message
{
	public void Printmessage() {
		System.out.println("In functional Method");
		}
}

public class FunctionInterface {

	public static void main(String[] args) {

		Mymessage ob1 = new Mymessage();
		ob1.Printmessage();
	}

}
*/
/*
 
 //====================================================================================


//------ Same program using anonymous class
@FunctionalInterface
interface Message
{
	void Printmessage();
}

public class FunctionInterface {

	public static void main(String[] args) {

		Message ob1 = new Message() {
			
			public void Printmessage()
			{
				System.out.println("In functional Method Annonymous_1");
			}
		};
		ob1.Printmessage();
	}

}


//================================================================================================


//------ Same program using Lambda
@FunctionalInterface
interface Message
{
	void Printmessage();
}

public class FunctionInterface {

	public static void main(String[] args) {

		Message ob1 = () -> {
				System.out.println("In functional Method Using Lamda_1");
			};
		ob1.Printmessage();
	}

}

//===================================================================================================

//------ Also Can Be Wrriten as
@FunctionalInterface
interface Message
{
	void Printmessage();
}

public class FunctionInterface {

	public static void main(String[] args) {

		Message ob1 = () -> System.out.println("In functional Method Using Lamda_2");
		ob1.Printmessage();
	}

}


//===================================================================================

//--------------------------Passing Single Value------------------------------------

@FunctionalInterface

interface PassSingVal
{
	void TakeValue(int x);
}

public class FunctionInterface {

	public static void main(String[] args) {
		
		PassSingVal val = new PassSingVal() {
			
			public void TakeValue(int x)
			{
				System.out.println("x Value using Anno= "+x);
			}
		};
		val.TakeValue(100);
	}
}

//===============================================================================================


@FunctionalInterface
interface PassValue
{
	void PassSingval(int x);
}

public class FunctionInterface {

	public static void main(String[] args) {
		
		PassValue pval = (int x) -> System.out.println("VAlue Of x using Lambda= "+x);
		
		pval.PassSingval(200);
	}
}


//====================================================================================================

@FunctionalInterface

interface PassSingValue
{
	void PassSingVal(int x);
}

public class FunctionInterface {

	public static void main(String[] args) {
		
		PassSingValue PVal= x -> System.out.println("Value Of X Lambda_2 : "+x);
		
		PVal.PassSingVal(300);
	}
}


//=========================================================================================


//--------------------------Passing Multiple Value------------------------------------

@FunctionalInterface
interface MulVale
{
	void MulValuEx(int x,int y);
}

public class FunctionInterface {

	public static void main(String[] args) {
		
		MulVale m = new MulVale() {
			
			public void MulValuEx(int x,int y)
			{
				int z = x+y;
				System.out.println("Add Of TWo Numbers is : "+z); //Anno
			}
		};
		m.MulValuEx(100, 2000);
	}
}


//==========================================================================================

@FunctionalInterface
interface MulValEx{
	void Add(int x,int y);
}


public class FunctionInterface {

	public static void main(String[] args) {
		
		MulValEx m1 = (int x,int y) -> System.out.println("The Add Using Lambda :"+(x+y));
		
		m1.Add(10, 200);
	}
}

//======================================================================================

@FunctionalInterface
interface MulValEx{
	void Add(int x,int y);
}


public class FunctionInterface {

	public static void main(String[] args) {
		
		MulValEx m1 = ( x,y) -> System.out.println("The Add Using Lambda :"+(x+y));
		
		m1.Add(10, 200);
	}
}


//=================================================================================================


//--------------------------------Returning Value---------------------------------------

interface MathOpration
{
	double Oprate(double x,double y);
	default void DisplayResult(double Result)
	{
		System.out.println("Result : "+Result);
	}
	
	static void DisplayMessage()
	{
		System.out.println("Performming Math Oprations ");
	}
}

class Calculation implements MathOpration
{
	public double Oprate(double x,double y)
	{
		double sum = x+y;
		return sum;
	}

}

public class FunctionInterface {

	public static void main(String[] args) {
		
		Calculation addition = new Calculation();
		double result=addition.Oprate(10,20);
		
		addition.DisplayResult(result);
		
		MathOpration.DisplayMessage();
	}
}



//================================================================================================

// Implementing the functional interface using Anonymous class


interface ReturnValue
{
	double Oprate(double x,double y);
	default void Showresult(double result)
	{
		System.out.println("Result = "+result);
	}
	static void ShowMessage() {
		System.out.println("Performimg Math Opration :");
	}
}


public class FunctionInterface {

	public static void main(String[] args) {
		
		ReturnValue r = new ReturnValue() {
			
			public double Oprate(double x,double y)
			{
				double sum = x+y;
				return sum;
			}
		};
		double result =r.Oprate(10,20);
		r.Showresult(result);
		ReturnValue.ShowMessage();
	}
}



//================================================================================
// Using lambda expression

interface ValueReturn
{
	double Oprate(double x,double y);
	
	default void ShowResult(double result)
	{
		System.out.println("Result "+result);
	}
	static void SHowMessage() {
		System.out.println("Performming Math Opration ..............");
	}
}

public class FunctionInterface {

	public static void main(String[] args) {
		ValueReturn valre = (double x,double y) -> (x+y);
		
		double result = valre.Oprate(10, 30);
		valre.ShowResult(result);
		ValueReturn.SHowMessage();
	}
}

*/
//==========================================================================

//And It Can Finnally;

interface ValueReturn
{
	double Oprate(double x,double y);
	
	default void ShowResult(double result)
	{
		System.out.println("Result "+result);
	}
	static void SHowMessage() {
		System.out.println("Performming Math Opration ..............");
	}
}

public class FunctionInterface {

	public static void main(String[] args) {
		ValueReturn valre = (x,y) -> x+y;
		
		double result = valre.Oprate(10, 30);
		valre.ShowResult(result);
		ValueReturn.SHowMessage();
	}
}
