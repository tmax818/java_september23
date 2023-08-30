public class Bird extends Avian implements Flyable{

    @Override
    public void fly() {
        System.out.printf("The %s is flying", this.getClass().getSimpleName());
    }
    
}
