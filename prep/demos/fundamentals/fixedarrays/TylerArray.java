import java.util.Arrays;

public class TylerArray {

    Integer[] thearray = new Integer[10];

    public void push(int item) {
        if(this.thearray[this.thearray.length - 1] != null) {
            Integer[] newArray = new Integer[this.thearray.length * 2];
            for(int i = 0; i < newArray.length; i++){
                newArray[i] = this.thearray[i];
            }
            System.out.println(newArray);
        }
        this.thearray = newArray;
        for(int i = 0; i < this.thearray.length; i++){
            if(this.thearray[i] == null){
                this.thearray[i] = item;
                break;
            }
        }
        System.out.println(Arrays.toString(thearray));
    }

    


}
