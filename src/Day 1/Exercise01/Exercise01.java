public class Exercise01 {

    public static void main(String[] args) {

        // Test bytes
        byte a = 010;
        byte b = 101;

        // "Add" function
	    //i code (byte) in this line because byte required and it is provide integer
        byte sum = (byte) add(a, b);
        System.out.println("This sum of bytes a and b is: " + sum);

    }

    static int add(byte a, byte b) {
        return (byte)(a + b);
    }

}
