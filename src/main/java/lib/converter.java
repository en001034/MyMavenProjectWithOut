package lib;

public class converter {
	public static double kmToMile(int distance)
	{
	  double tomile =distance*0.621;
		  return tomile;
	}
	
	public static int cTof(int temp)
	{
		int toFarhenheit =(temp*9/5)+32;
		return toFarhenheit;
		
	}
	
	public static int fToc(int temp)
	{
		int toFarhenheit =(temp-32/5)*5/9;
		return toFarhenheit;
	}
}
