public class EvenSumWhile {
    public static void main(String[] args) {

        int i = 0;       // First even number
        int sum = 0;     // Store the sum
        int count = 0;   // Count even numbers

        while (count < 10) {
            sum = sum + i;
            i = i + 2;
            count++;
        }

        System.out.println("Sum = " + sum);
    }
}