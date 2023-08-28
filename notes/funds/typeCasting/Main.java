public class Main {

    public static void main(String[] args) {

        System.out.println("explicit casting");
        short myShort = 320; // 0001 0100 0000
        short myBigShort = 32000; // 0111 1101 0000 0000

        byte myByte = (byte) myShort; // 0100 0000
        byte myBigByte = (byte) myBigShort; // 0000 0000
        System.out.println(myByte);
        System.out.println(myBigByte);

        System.out.println("implicit casting");
        byte myOtherByte = 32;

        short myOtherShort = myOtherByte;
        System.out.println(myOtherShort);
    }
    
}
