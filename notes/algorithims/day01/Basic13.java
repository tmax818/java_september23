import java.util.Arrays;

public class Basic13 {

    static String INFO;
    
// TODO: Print all the integers from 1 to 255.

public static void print1to255(){
    for(int i = 1; i < 256; i++){
        System.out.println(i);
    }
}

// TODO: Print integers from 0 to 255, and with each integer print the sum so far.

public void printIntsAndSum(){
    int sum = 0;
    for(int i = 0; i < 256; i++){
        sum += i; 
        System.out.println(i);
        System.out.println(sum);
    }
}

// TODO: Given an array, find and print its largest element.

public void findAndPrintLargest(int[] theArr){
    int max = theArr[0];
    for(int i = 1; i < theArr.length; i++ ){
        if(theArr[i] > max){
            max = theArr[i];
        }
    }
    System.out.println(max);

}

// TODO: Create an array with all the odd integers between 1 and 255 (inclusive).

// TODO: Given an array and a value Y, count and print the number of array values greater than Y.

// TODO: Given an array, print the max, min and average values for that array.
    
// TODO: Replace any negative array values with 'Dojo'.

// TODO: Print all odd integers from 1 to 255.

// TODO: Iterate through a given array, printing each value.

// TODO: Analyze an array’s values and print the average

// TODO: Square each value in a given array, returning that same array with changed values

// TODO: Return the given array, after setting any negative values to zero.

// TODO: Given an array, move all values forward by one index, dropping the first and leaving a '0' value at the end.


}
