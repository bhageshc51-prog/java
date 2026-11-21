public class Day06Loops {
    public static void main(String[] args) {

        for (int counter = 0; counter < 100; counter = counter + 1) {
            System.out.println("Hello World");
        }

    }
}


// Question:
// Write a Java program using a for loop to print
// "Hello World" 100 times.

public class Day06Loops {
    public static void main(String[] args) {

        // The for loop had 3 main parts:
        // 1. Initialization
        // 2. Condition
        // 3. Increment

        for (int counter = 0; counter < 100; counter = counter + 1) {

            // Printed Hello World on a new line.
            System.out.println("Hello World");
        }
    }
}

// Step-by-step execution:

// int counter = 0
// -> Initialization
// -> The counter started from 0.

// counter < 100
// -> Condition
// -> The loop continued while the counter was less than 100.

// System.out.println("Hello World");
// -> Printed Hello World on a new line.

// counter = counter + 1
// -> Increment
// -> The counter increased by 1 after every iteration.

// Execution:

// counter = 0  -> 0 < 100  -> Printed Hello World
// counter = 1  -> 1 < 100  -> Printed Hello World
// counter = 2  -> 2 < 100  -> Printed Hello World
// ...
// counter = 98 -> 98 < 100 -> Printed Hello World
// counter = 99 -> 99 < 100 -> Printed Hello World
// counter = 100 -> 100 < 100 -> False -> Loop stopped.

// Output:
// Hello World
// Hello World
// ...
// (Printed exactly 100 times)
