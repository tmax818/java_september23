import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrays {

    public static void main(String[] args) {
        String[] names = new String[8];
        System.out.println(Arrays.toString(names));
        names[0] = "Christian";
        System.out.println(Arrays.toString(names));
        String[] days = {"Monday", "Tuesday", null, null, null};
        System.out.println(Arrays.toString(days));
        days[2] = "Wednesday";
        System.out.println(Arrays.toString(days));

        ArrayList<String> namesDynamic = new ArrayList<>();
        namesDynamic.add("Christian");
        namesDynamic.add("Tyler");
        namesDynamic.add("Braxton");
        System.out.println(namesDynamic);


        
    }

    
}
