package LAB_6;

public class WapperIntergerDemo {
    public static void main(String[] args) {
        // Integer value
        Integer num = 123;

        // 1. toString() - Converts the integer to a String
        String numString = num.toString();
        System.out.println("Integer to String: " + numString);

        // 2. parseInt() - Converts a String to an integer
        String str = "456";
        int parsedInt = Integer.parseInt(str);
        System.out.println("String to Integer: " + parsedInt);

        // 3. intValue() - Converts Integer to int
        int intValue = num.intValue();
        System.out.println("Integer to int: " + intValue);
    }
}


