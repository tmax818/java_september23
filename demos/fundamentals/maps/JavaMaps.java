import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JavaMaps {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> people = new HashMap<>();
        arrayList.addAll(Arrays.asList(2,3,4,42,35));
        people.put("numbers", arrayList);
        System.out.println(people);
        System.out.println(people.get("numbers"));
        
    }    
    
}
