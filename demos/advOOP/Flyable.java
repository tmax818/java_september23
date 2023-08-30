public interface Flyable {
    
    public abstract void fly();

    public default void land(){
        System.out.printf("The %s is landing", this.getClass().getSimpleName());
    }
}
