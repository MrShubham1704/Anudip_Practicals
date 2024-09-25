package LAB_6;

public class DoubleWapperMethods {
	public static void main(String[] args) {
		// Double value
		Double num = 123.456;

		// 1. toString() - Converts the double to a String
		String numString = num.toString();
		System.out.println("Double to String: " + numString);

		// 2. parseDouble() - Converts a String to a double
		String str = "789.123";
		double parsedDouble = Double.parseDouble(str);
		System.out.println("String to Double: " + parsedDouble);

		// 3. doubleValue() - Converts Double to double
		double doubleValue = num.doubleValue();
		System.out.println("Double to double: " + doubleValue);
	}
}

