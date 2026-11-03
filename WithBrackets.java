public class WithBrackets {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int ans = (a * b) / (a - b);
        System.out.println(ans);
    }
}

// WHY 10 IS CORRECT AND 0 IS INCORRECT

// Correct code:
// int ans = (a * b) / (a - b);

// First, calculate (a * b).
// 10 * 5 = 50.

// Next, calculate (a - b).
// 10 - 5 = 5.

// Finally, divide 50 by 5.
// 50 / 5 = 10.

// Therefore, the correct answer is 10.

// WHY 0 IS INCORRECT:

// In the code without parentheses:
// int ans = a * b / a - b;

// Java follows operator precedence.
// * and / are evaluated before -.

// So:
// 10 * 5 / 10 - 5
// = 50 / 10 - 5
// = 5 - 5
// = 0.

// Therefore, 0 is the result of a DIFFERENT expression.
// It is not the answer to (a * b) / (a - b).

// FINAL ANSWER
// 10 → CORRECT 
// 0  → INCORRECT 