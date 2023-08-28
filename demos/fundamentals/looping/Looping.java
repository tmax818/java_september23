import java.util.Arrays;

public class Looping {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        for(int i = 0; i < args.length; i++ ){
            System.out.println(args[i].substring(0, 1).toUpperCase() + args[i].substring(1));
        }
    }
}
