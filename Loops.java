// Question:
// Write a Java program using a for loop to print "Hello World" 3 times.

public class Loops {
    public static void main(String args[]) {

        // for loop has 3 parts:
        // 1. Initialization
        // 2. Condition
        // 3. Increment/Decrement

        for(int counter = 0; counter < 3; counter = counter + 1) {

            // Prints "Hello World"
            System.out.println("Hello World");
        }
    }
}

// Step-by-step:
// counter = 0 → Initialization → loop starts from 0
// counter < 3 → Condition → loop runs while counter is less than 3
// System.out.println() → prints "Hello World"
// counter = counter + 1 → Increment → counter increases by 1
// counter = 0 → Print Hello World
// counter = 1 → Print Hello World
// counter = 2 → Print Hello World
// counter = 3 → Condition is false → loop stops

// Output:
// Hello World
// Hello World
// Hello World
