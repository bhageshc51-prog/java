public class shifts {
    public static void main(String[] args) {
        System.out.println("Left Shift (10 << 2): " + (10 << 2));   // 10 * 4 = 40
        System.out.println("Left Shift (10 << 3): " + (10 << 3));   // 10 * 8 = 80
 
        System.out.println("Right Shift (10 >> 1): " + (10 >> 1));  // 10 / 2 = 5
        System.out.println("Right Shift (20 >> 2): " + (20 >> 2));  // 20 / 4 = 5

        System.out.println("Unsigned Right Shift (20 >>> 2): " + (20 >>> 2)); // 5
        System.out.println("Unsigned Right Shift (-10 >>> 2): " + (-10 >>> 2)); // High 0s filled
    }
}