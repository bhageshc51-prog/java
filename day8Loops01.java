#code
    import java.util.*;

public class Loops02 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}



# OUTPUT:

# Input: 20
# Sum = 210


    
# JAVA FOR LOOP — STEP-BY-STEP EXPLANATION

// ============================================
// QUESTION:
// Write a Java program to calculate the sum
// of numbers from 0 to n using a for loop.
// ============================================

// STEP 1: Import Scanner
import java.util.*;
// Imports utility classes to take user input.

// STEP 2: Create a class
public class Loops01 {

// STEP 3: Main method
    public static void main(String args[]) {

// STEP 4: Take input from the user
        Scanner sc = new Scanner(System.in);
// Creates a Scanner object to read keyboard input.

        int n = sc.nextInt();
// Reads an integer entered by the user.

// STEP 5: Initialize sum
        int sum = 0;
// Stores the total. Initially, sum is 0.

// STEP 6: Start the for loop
        for (int i = 0; i <= n; i++) {
// int i = 0  -> Starts the counter at 0.
// i <= n     -> Continues while i is <= n.
// i++        -> Increases i by 1 after each iteration.

// STEP 7: Add the current number
            sum = sum + i;
// Adds i to sum and updates the total.
        }

// STEP 8: Print the result
        System.out.println("Sum = " + sum);
// Displays the final sum.

// STEP 9: Close Scanner
        sc.close();
// Closes the Scanner after input is complete.
    }
}

// ============================================
// DRY RUN:
// Input: 5
//
// i = 0 -> sum = 0 + 0 = 0
// i = 1 -> sum = 0 + 1 = 1
// i = 2 -> sum = 1 + 2 = 3
// i = 3 -> sum = 3 + 3 = 6
// i = 4 -> sum = 6 + 4 = 10
// i = 5 -> sum = 10 + 5 = 15
//
// Next i = 6
// Condition 6 <= 5 is FALSE.
// The loop stops.
//
// ============================================
// OUTPUT:
//
// 5
// Sum = 15
//
// ============================================
// IMPORTANT CONCEPTS:
//
// 1. Scanner -> Takes user input.
// 2. int -> Stores integer values.
// 3. for loop -> Repeats a block of code.
// 4. i++ -> Increases the counter by 1.
// 5. sum = sum + i -> Updates the total.
// 6. println() -> Prints output on a new line.
//
// ============================================
// CONCLUSION:
//
// This program calculates the sum of all
// integers from 0 to n, including n.
//
// Keep learning Java one program at a time! 🚀
// ============================================
