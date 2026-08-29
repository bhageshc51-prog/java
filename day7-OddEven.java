import java.util.*;

public class OddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

//explaination
import java.util.*;
// Imports the Scanner class to take input from the user.

public class OddEven {
// Defines a class named OddEven.

    public static void main(String args[]) {
    // main() is the starting point of the Java program.

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to take input from the keyboard.

        int x = sc.nextInt();
        // Takes an integer input from the user and stores it in x.

        if (x % 2 == 0) {
        // Checks whether the remainder of x divided by 2 is 0.
        // If the remainder is 0, the number is Even.

            System.out.println("Even");
            // Prints "Even" if the condition is true.

        } else {
        // Executes when the if condition is false.

            System.out.println("Odd");
            // Prints "Odd" if the number is not divisible by 2.
        }
    }
}

//% = Modulo operator → gives the remainder.
10 % 2 = 0 → Even 
7 % 2 = 1 → Odd
