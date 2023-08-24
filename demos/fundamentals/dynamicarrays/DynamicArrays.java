package demos.fundamentals.dynamicarrays;

import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);
        numbers.add(3);
        numbers.add(42);
        numbers.add(33);
        numbers.add(34);
        numbers.add(0, 78);
        System.out.println(numbers);
        System.out.println(numbers);
        numbers.set(2, 99);
        System.out.println(numbers.get(0));

        ArrayList<Object> junk = new ArrayList<>();
        junk.add(43);
        junk.add("A random string");
        junk.add(false);
        junk.add(3.14);
        System.out.println(junk);

}

}
