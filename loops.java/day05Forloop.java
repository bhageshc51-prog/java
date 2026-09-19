// Write a Java program using a for loop to print numbers
// from 0 to 10 in a single line.

public class day2Loops {
    public static void main(String args[]) {

        // counter++ means:
        // counter = counter + 1

        // Initialization → counter = 0
        // Condition → counter < 11
        // Increment → counter++

        for(int counter = 0; counter < 11; counter++) {

            // print() keeps the output on the same line.
            // " " adds a space between the numbers.
            System.out.print(counter + " ");
        }
    }
}

// Output:
// 0 1 2 3 4 5 6 7 8 9 10
