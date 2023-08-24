public class Main {
    
    public static void main(String[] args) {
        GenericExample<Integer> genericExample = new GenericExample<Integer>();
        genericExample.setObj(4);
        System.out.println(genericExample.getObj().getClass());
    }
    
}
