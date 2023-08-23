package demos.fundamentals.strings;

public class Strings {

    public static void main(String[] args) {

        // create a string
        String str = "Java is awesome!";


        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.concat(" Dude!!!"));
        System.out.println(str.contains("java"));
        System.out.println(str.length());
        System.out.println(str.repeat(2));


        System.out.println("When to use `==` and .equals()?");

        String str1 = new String("Coding Dojo");
        String str2 = "Coding Dojo";
        String str3 = "Coding Dojo";

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);


        



    }
    
}
