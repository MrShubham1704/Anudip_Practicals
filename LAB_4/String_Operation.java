package LAB_4;

public class String_Operation {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "HELLO, WORLD!";
        String str3 = "hello";
        String str4 = "";

        // replace
        System.out.println("replace:  " + str.replace('l', 'p'));

        // contains
        System.out.println("contains:  " + str.contains("World"));

        // replaceAll
        System.out.println("replaceAll:  " + str.replaceAll("World", "Java"));

        // indexOf
        System.out.println("indexOf:  " + str.indexOf('o'));

        // substring
        System.out.println("substring:  " + str.substring(7));

        // equals
        System.out.println("equals:  " + str.equals(str2));

        // lastIndexOf
        System.out.println("lastIndexOf:  " + str.lastIndexOf('o'));

        // startsWith
        System.out.println("startsWith:  " + str.startsWith("Hello"));

        // endsWith
        System.out.println("endsWith:  " + str.endsWith("!"));

        // equalsIgnoreCase
        System.out.println("equalsIgnoreCase:  " + str.equalsIgnoreCase(str2));

        // toLowerCase
        System.out.println("toLowerCase:  " + str2.toLowerCase());

        // toUpperCase
        System.out.println("toUpperCase:  " + str3.toUpperCase());

        // isEmpty
        System.out.println("isEmpty:  " + str4.isEmpty());

        // length
        System.out.println("length:  " + str.length());

        // split
        String[] parts = str.split(", ");
        System.out.println("split:  ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
