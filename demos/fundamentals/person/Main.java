public class Main {
    public static void main(String[] args) {
        // dependency injection
        Person christian = new Person();
        System.out.println(christian);
        christian.setAge(23);
        christian.setHeight(80.0);
        Person braxton = new Person();
        System.out.println(christian.getAge());

    }
}
