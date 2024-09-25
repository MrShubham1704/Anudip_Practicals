package LAB_6;

public class FloatWrapperMethods {
	public static void main(String[] args) {
		// Float value
		Float num = 123.45f;

		// 1. toString() - Converts the float to a String
		String numString = num.toString();
		System.out.println("Float to String: " + numString);

		// 2. parseFloat() - Converts a String to a float
		String str = "678.90";
		float parsedFloat = Float.parseFloat(str);
		System.out.println("String to Float: " + parsedFloat);

		// 3. floatValue() - Converts Float to float
		float floatValue = num.floatValue();
		System.out.println("Float to float: " + floatValue);
	}
}

