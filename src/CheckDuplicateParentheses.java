import java.util.*;
/*Write a program that can evaluate a given balanced expression for the duplicate parenthesis if it contains.
If the expression includes duplicate parenthesis then print “Input string contains duplicate parenthesis” else print “Input string
does not contain duplicate parenthesis”.
Your application should take the following as input:
The input string in a single line without any space between the characters.
Note: The program should only test for duplicate parenthesis which means the other brackets ‘{‘ or ‘[‘ will be just as normal characters like ‘a’ or ‘1’
Sample Input:
(((a+1))+(b+1))
Sample output:
Input string contains duplicate parenthesis
Sample Input:
(909)
Sample output:
Input string does not contain duplicate parenthesis
*/
public class CheckDuplicateParentheses {

        public static String findDuplicateParenthesis(String inputString) {
            //write your code here
            Stack<Character> stack = new Stack();
            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                if (ch != ')') {
                    stack.push(ch);
                } else {
                    char top = stack.peek();
                    stack.pop();
                    int count = 0;
                    while (top != '(') {
                        top = stack.peek();
                        stack.pop();
                        count++;
                    }
                    if (count <= 1) {
                        return "Input string contains duplicate parenthesis";
                    }
                }
            }
            return "Input string does not contain duplicate parenthesis";
        }
    public static void main(String[] args) {
        CheckDuplicateParentheses obj = new CheckDuplicateParentheses();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));
    }
}

