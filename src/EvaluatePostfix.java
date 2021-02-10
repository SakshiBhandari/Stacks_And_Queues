import java.util.*;
/*You are given a postfix expression as an input and you have to evaluate that postfix expression and print the output.
Input: The input will be in the following format :
Postfix expression
Output: The output should be of the following format
Evaluate the postfix expression and print the output
Note: Operands will be digits only.
Example :
Input:
12+
Output:
3
*/
public class EvaluatePostfix {

        public static void main(String arg[]) {
            Stack<Integer> s = new Stack<Integer>();
            Scanner in = new Scanner(System.in);

            String exp = in.nextLine();
            //Write your code here
            System.out.println(evaluatePostfix(exp));
}
    static int evaluatePostfix(String exp)
    {
        Stack<Integer> stack=new Stack<>();

    // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
    {
        char c=exp.charAt(i);

        // If the scanned character is an operand (number here),
        // push it to the stack.
        if(Character.isDigit(c))
            stack.push(c - '0');

            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
        else
        {
            int val1 = stack.pop();
            int val2 = stack.pop();

            switch(c)
            {
                case '+':
                    stack.push(val2+val1);
                    break;

                case '-':
                    stack.push(val2- val1);
                    break;

                case '/':
                    stack.push(val2/val1);
                    break;

                case '*':
                    stack.push(val2*val1);
                    break;
            }
        }
    }
        return stack.pop();
    }
}
//for (char ch : exp.toCharArray()) {
//            if (Character.isDigit(ch)) {
//                s.push(ch - '0');
//            } else {
//                int b = s.pop();
//                int a = s.pop();
//                if (ch == '+') {
//                    s.push(a + b);
//                } else if (ch == '-') {
//                    s.push(a - b);
//                } else if (ch == '*') {
//                    s.push(a * b);
//                } else if (ch == '/') {
//                    s.push(a / b);
//                }
//            }
//        }
//        System.out.println(s.peek());
//    }
//}