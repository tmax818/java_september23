public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num = 42;
        calculator.add(num, 32);
        System.out.println(calculator.add(num, 32));
        System.out.println(calculator.add(3.14, 4.5));
    }
    
}
