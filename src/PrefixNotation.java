import java.util.*;
/*
You are given an algebraic expression in prefix notation, your task is to write a program to compute the given expression and print the result using a stack.
Constraints: The time complexity and space complexity of your solution should be O(n).
Input: The program will take an input expression as a space separated string.
Output: Print the result of the given input expression
Sample Test Case:
Input:
+ 6 4
Output:
10
 */

public class PrefixNotation {
    static Boolean isOperand(char c) {
        // If the character is a digit
        // then it must be an operand
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }

    public static int computeResult(String input) {

        Stack<Integer> Stack = new Stack<Integer>();
        input = input.replaceAll("\\s", "");
        for (int j = input.length() - 1; j >= 0; j--) {

            // Push operand to Stack
            // To convert exprsn[j] to digit subtract
            // '0' from exprsn[j].
            if (isOperand(input.charAt(j)))
                Stack.push((Integer) (input.charAt(j) - 48));

            else {

                // Operator encountered
                // Pop two elements from Stack
                int o1 = Stack.peek();
                Stack.pop();
                int o2 = Stack.peek();
                Stack.pop();

                // Use switch case to operate on o1
                // and o2 and perform o1 O o2.
                switch (input.charAt(j)) {
                    case '+':
                        Stack.push(o1  +  o2);
                        break;
                    case '-':
                        Stack.push(o1 - o2);
                        break;
                    case '*':
                        Stack.push(o1 * o2);
                        break;
                    case '/':
                        Stack.push(o1 / o2);
                        break;
                }
            }
        }

        return Stack.peek();
    }
    public static void main(String[] args) {
        PrefixNotation obj=new PrefixNotation();
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();
        System.out.println(computeResult(input));
    }
}
