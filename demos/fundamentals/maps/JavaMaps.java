import java.util.ArrayList;
import java.util.HashMap;
public class JavaMaps {

    public static void main(String[] args) {
        
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        System.out.println(userMap);

        GenericExample<Integer> genericExample = new GenericExample<Integer>();
        HashMap<String, ArrayList<Integer>> addressBook = new HashMap<>();
        ArrayList<Integer> lottoNums = new ArrayList<>();
        lottoNums.add(42);
        lottoNums.add(32);
        lottoNums.add(2);
        lottoNums.add(13);
        // lottoNums.add("I like pie");
        addressBook.put("Braxton", lottoNums);
        System.out.println(addressBook.get("Braxton"));

        ArrayList<Object> junk = new ArrayList<>();
        junk.add("whatever");
        junk.add(13);
        junk.add(true);

        System.out.println(junk);

    }




    
}
