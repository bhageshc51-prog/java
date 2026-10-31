public class day14 {

    public static void main(String[] args) {

        

        for (int counter = 0; counter < 11; counter++) {

            
            System.out.println(counter);
        }
    }
}

Output:
0
1
2
3
4
5
6
7
8
9
10

 EXPLANATION

  // =====================================================
//              FOR LOOP IN JAVA - 3 VERSIONS
// =====================================================

// QUESTION:
// Write a Java program using a for loop to print numbers
// from 0 to 10.


// =====================================================
// CODE 1 - counter + println()
// =====================================================

public class day1Loops {

    public static void main(String[] args) {

        // counter++ means counter = counter + 1

        for (int counter = 0; counter < 11; counter++) {

            // println() prints the value and moves to the next line
            System.out.println(counter);
        }
    }
}

/*

Output:

0
1
2
3
4
5
6
7
8
9
10

*/


// =====================================================
// CODE 2 - counter + print()
// =====================================================

class day2Loops {

    public static void main(String[] args) {

        // counter++ increases counter by 1

        for (int counter = 0; counter < 11; counter++) {

            // print() keeps output on the same line
            // " " adds a space after each number
            System.out.print(counter + " ");
        }
    }
}

/*

Output:

0 1 2 3 4 5 6 7 8 9 10

*/


// =====================================================
// CODE 3 - i + println()
// =====================================================

class day3Loops {

    public static void main(String[] args) {

        // i is the loop variable
        // It starts from 0

        for (int i = 0; i < 11; i++) {

            // println() prints each number on a new line
            System.out.println(i);
        }
    }
}


/*
=====================================================
                COMMON FOR LOOP STRUCTURE
=====================================================

for(initialization; condition; increment/decrement)

1. Initialization:
   int counter = 0;
   -> Starts the counter from 0.

2. Condition:
   counter < 11;
   -> Loop continues while counter is less than 11.

3. Increment:
   counter++;
   -> Counter increases by 1 after every iteration.


=====================================================
                    MAIN DIFFERENCE
=====================================================

Code 1:
counter + println()
-> Output prints vertically.

Code 2:
counter + print()
-> Output prints horizontally on the same line.

Code 3:
i + println()
-> Same logic as Code 1.
-> Only the variable name changes from counter to i.


=====================================================
                    IMPORTANT
=====================================================

counter++
-> Same as:
counter = counter + 1;

println()
-> Prints and moves to a new line.

print()
-> Prints on the same line.

All programs use a for loop to print numbers from 0 to 10.

=====================================================
*/
