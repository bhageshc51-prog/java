// Question:
// Write a Java program using a for loop to print the numbers from 0 to 10.

public class Numbers {
    public static void main(String[] args) {

        // for loop has 3 main parts:
        // 1. Initialization
        // 2. Condition
        // 3. Increment

        for (int num = 0; num <= 10; num = num + 1) {

            // Prints the current value of num
            // print() keeps all numbers on the same line
            System.out.print(num + " ");
        }
    }
}

// Step-by-step execution:

// int num = 0
// → Initialization
// → The loop starts from 0.

// num <= 10
// → Condition
// → The loop continues while num is less than or equal to 10.

// System.out.print(num + " ")
// → Prints the current value of num on the same line.

// num = num + 1
// → Increment
// → num increases by 1 after every iteration.

// Execution:
// num = 0 → 0 <= 10 → Print 0 → num becomes 1
// num = 1 → 1 <= 10 → Print 1 → num becomes 2
// num = 2 → 2 <= 10 → Print 2 → num becomes 3
// ...
// num = 9 → 9 <= 10 → Print 9 → num becomes 10
// num = 10 → 10 <= 10 → Print 10 → num becomes 11
// num = 11 → 11 <= 10 → False → Loop stops.

// Output:
// 0 1 2 3 4 5 6 7 8 9 10
