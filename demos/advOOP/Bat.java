public class Bat extends Mammal implements Flyable {

    @Override
    public void fly() {
        System.out.printf("The %s is flying", this.getClass().getSimpleName());
    }

    @Override
    public void land(){
        Flyable.super.land();
        System.out.println("I land like a bat, Bro!!!");
    }
    
}
