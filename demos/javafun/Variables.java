public class Variables {

    public static void main(String[] args){

        System.out.println("These are the primitive types:");
        byte myByte = 127;
        short myShort = 4;
        int myInt = 42;
        long myLong = 43;
        float myFloat = 3.14f;
        double myDouble = 6.02e23;
        int myCharASCII = 'T';
        char myChar = 'T';
        boolean myBoolean = "";
        
        System.out.printf("myByte is %d\n", myByte);
        System.out.printf("myShort is %d\n", myShort);
        System.out.printf("myInt is %d\n", myInt);
        System.out.printf("myLong is %d\n", myLong);
        System.out.printf("myFloat is %f\n", myFloat);
        System.out.printf("myDouble is %f\n", myDouble);
        System.out.printf("myChar is %d\n", myCharASCII);
        System.out.printf("myChar is %c\n", myChar);
        System.out.printf("myBoolean is %b\n", myBoolean);
        
        System.out.println();
        System.out.println("What is the difference between primitive and object types?");
        
        Byte mywByte = 127;
        Short mywShort = 4;
        Integer mywInt = 42;
        Long mywLong = 43L;
        Float mywFloat = 3.14f;
        Double mywDouble = 6.02e23;
        Character mywChar = 'T';
        Boolean mywBoolean = false;
        
        System.out.printf("myByte is %d\n", mywByte.MAX_VALUE);
        System.out.printf("myShort is %d\n", mywShort.MAX_VALUE);
        System.out.printf("myInt is %d\n", mywInt.MAX_VALUE);
        System.out.printf("myLong is %d\n", mywLong.MAX_VALUE);
        System.out.printf("myFloat is %f\n", mywFloat.MAX_VALUE);
        System.out.printf("myDouble is %f\n", mywDouble.MAX_VALUE);
        System.out.printf("myChar is %c\n", mywChar.MAX_VALUE);
        System.out.printf("myBoolean is %b\n", mywBoolean.booleanValue());
        
    }
}

