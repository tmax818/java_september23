import java.util.Random;
import java.util.Scanner;

public class Conditionals {

    static boolean isRaining = true;

    public static void main(String[] args) {

        if(true){
            System.out.println("This works!!!");
        }

        if(isRaining){
            System.out.println("Bring an umbrella");
        }


        
        Random rand = new Random();
        int number = rand.nextInt(10);
        System.out.println(number);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int guess = Integer.parseInt(s.nextLine());
        System.out.println(guess == number);
        while(number != guess){
            if(guess > number){
                System.out.println("Too high!, guess again!");
            } else {
                System.out.println("Too low, guess again!");
            }
            guess = Integer.parseInt(s.nextLine());
        } 
        System.out.println("You got it!!!");
        

        s.close();
        

    


    }
    
}
