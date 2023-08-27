import java.util.Arrays;

public class FixedArrays {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        int[] ages = {23, 24, 45, 32, 12};
        String[] names = new String[5];
        // names[0] = "Suzie";
        // names[1] = "Mark";
        // names[2] = "Mary";
        // names[3] = "Joe";
        // names[4] = "John";
        // names[0] = args[0];
        // names[1] = args[1];
        // names[2] = args[2];
        // names[3] = args[3];
        // names[4] = args[4];


        for(int i = 0; i < ages.length; i++){
            // System.out.println(ages[i]);
            // System.out.println(names[i]);
            System.out.printf("%s is %d years old!!\n", names[i], ages[i]);
        }
        


    }
}
    