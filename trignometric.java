
public class trignometric {
	public static final double PI = 3.141592653589793;
	
	//This Method will convert Degree value to Radian.
	public static double degreeToRadianConverter(double degree) {
		double radian = (degree*PI)/180;
		return radian;
	}
	
	//This Method will NormalizeRadian.
	public static double normalizeRadian(double radian) {
		double normalizeVal = radian % (2*PI);
		return normalizeVal;
	}
	
	//This function calculate even power or odd power to number. 
	public static double even_Odd_Power(double x, double count_pow) {
		double res = 1;
		for (int j=0; j<count_pow; j++)
			res = res * x;
		return res;
	}
		
	//This function calculate the factorial of a number.
	public static double factorial(double x) {
		double factorial_value = 1;
		for (int i = 1; i<=x; i++) 
			factorial_value  = factorial_value * i;
		return factorial_value;
		}
		
	//This Method will calculate Sin Value using Taylor Series by using factorial and even_Odd_power function.
	public static double sin(double x) {
		double sum = normalizeRadian(x);
	    double positive_negative = -1;
	    for (int count_pow=3; count_pow<=100; count_pow+=2)
		{
	    	sum = sum + positive_negative * (even_Odd_Power(normalizeRadian(x),count_pow)/factorial(count_pow));
	    	positive_negative = positive_negative * -1;
	    }
	    return sum;	
	}
	
	//This Method will calculate cos Value using Taylor Series by using factorial and even_Odd_power function.
	public static double cos(double x) {	
		 double y = 1;
		    double plus_or_negative = -1;
		    for (int counter=2; counter<=100; counter +=2) 
			{
				y = y + plus_or_negative * (even_Odd_Power(normalizeRadian(x),counter)/factorial(counter));
				plus_or_negative = plus_or_negative * -1;
		    }  
		    return y;	
		}

	//This method will calculate Tan Value.
	public static double tan(double x) {
		return sin(x)/cos(x);
	}
	public static void main(String args[]) {
		System.out.println((370));
	}
}
