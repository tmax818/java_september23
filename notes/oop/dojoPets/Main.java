public class Main {
    public static void main(String[] args) {
        String[] fluffyTricks = new String[3];
        Pet pet = new Pet("Fluffy", "cat", fluffyTricks);
        Ninja ninja = new Ninja("Joe", "ninja", pet, 50, "meow mix");
        pet.sleep();
        pet.eat();
        ninja.walk();
        Dog dog = new Dog("fido", "mutt", new String[5], 100,100);
        System.out.println(dog);
        Dog noArgDog = new Dog();
 
        System.out.println(ninja);
        System.out.println(pet);
        System.out.println(noArgDog);
        noArgDog.makeNoise();
        pet.makeNoise();
    }
}
