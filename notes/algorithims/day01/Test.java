import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Basic13 basic13 = new Basic13();
        Basic13.print1to255();
        basic13.printIntsAndSum();
        int[] nums = new int[9];
        int[] nums1 = {1,2,3,4,5,87,66};
        basic13.findAndPrintLargest(nums1);
    }
}
