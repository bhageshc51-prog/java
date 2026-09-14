// Question:
// Write a Java program using a for loop to print numbers from 0 to 10.

public class day6loops {
    public static void main(String args[]) {

        // for loop has 3 parts:
        // 1. Initialisation
        // 2. Condition
        // 3. Increment/Decrement

        for(int i = 0; i < 11; i++) {

            // Prints the current value of i
            System.out.println(i);
        }
    }
}

// Step-by-step:
//
// int i = 0
// → Initialisation
// → The loop starts from 0.
//
// i < 11
// → Condition
// → The loop continues while i is less than 11.
//
// System.out.println(i)
// → Prints the current value of i.
//
// i++
// → Increment
// → i increases by 1 after every iteration.
//
// Execution:
//
// i = 0 → 0 < 11 → Print 0 → i++
// i = 1 → 1 < 11 → Print 1 → i++
// i = 2 → 2 < 11 → Print 2 → i++
// i = 3 → 3 < 11 → Print 3 → i++
// ...
// i = 10 → 10 < 11 → Print 10 → i++
// i = 11 → 11 < 11 → False → Loop stops.
//
// Output:
// 0
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
