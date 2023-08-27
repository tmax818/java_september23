public class Main {

    public static void main(String[] args) {
        System.out.println("Inheritance Testing");
        Human human = new Human();
        System.out.println(human.isSleeping());
        human.startSleeping();
        System.out.println(human.isSleeping());
        human.regulateTemperature();
    }
    
}
