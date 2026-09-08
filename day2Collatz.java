public class day2Collatz {
    public static void main(String[] args) {

        int num = 21;

        while (num != 1) {

            System.out.print(num + " ");

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
        }

        System.out.println(1);
    }
}