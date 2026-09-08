public class EvenSumDoWhile {
    public static void main(String[] args) {

        int i = 0;       // First even number
        int sum = 0;     // Store the sum
        int count = 0;   // Count even numbers

        do {
            sum = sum + i;
            i = i + 2;
            count++;
        } while (count < 10);

        System.out.println("Sum = " + sum);
    }
}
