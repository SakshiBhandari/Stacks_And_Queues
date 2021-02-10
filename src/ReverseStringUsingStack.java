import java.util.Scanner;
import java.util.*;
/*You are given a string and you have to print the reverse of the string using a stack.
Input Format
A string which has to be reversed.
Output Format
The reverse of the input string
Sample Input 1:
abcd
*/

public class ReverseStringUsingStack {

        public static void main(String arg[]) {
            Stack<Character> s = new Stack<Character>();
            Scanner in = new Scanner(System.in);
            String ans = "", data = in.nextLine();
            for (char element : data.toCharArray()) {
                s.push(element);
            }
            for (char element : data.toCharArray()) {
                ans += s.pop();
            }
            System.out.print(ans);
        }
    }
