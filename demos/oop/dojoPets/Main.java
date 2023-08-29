public class Main {

    public static void main(String[] args) {

        Dog fido = new Dog();
        System.out.println(fido);
        fido.eat();
        System.out.println(fido);
        Pet unknownPet = new Pet();
        unknownPet.makeNoise();
        fido.makeNoise();

 
    }
    
}
