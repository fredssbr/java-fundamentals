package com.pluralsight.typeconversion;

public class Main {

	public static void main(String[] args) {

		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;

		// Widening conversion (implicit)
		short result1 = byteVal;
		// Narrowing conversion (explicit)
		short result2 = (short) longVal;
		short result3 = (short) (byteVal - longVal);
		// Widening conversion (results in the type of the largest)
		float result4 = longVal - floatVal;
		// Results in double (which is wider than long) - explicit conversion
		float result5 = (float) (longVal - doubleVal);
		// Results in double - explicit casting
		long result6 = (long) (shortVal - longVal + floatVal + doubleVal);

		System.out.println("Success");

	}

}
