public class Main {

    public static void main(String[] args) {
        Human richard = new Human();
        richard.goToWork();
        richard.startSleeping();
        Bird sparrow = new Bird();
        sparrow.startSleeping();
        Bat bat = new Bat();
        bat.regulateTemperature();
        bat.fly();
        sparrow.fly();
        sparrow.land();
        bat.land();



    }
    
}
