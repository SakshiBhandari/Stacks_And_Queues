import java.util.*;
/*Write a program that will convert the given two positive decimal integers to their binary representation and return their
sum in the binary format using a queue.
Constraints:  The time complexity of your program should be O(n) and you are allowed to use only one queue and no other data structure.
Input: The input should be in the following format
The first line will take the first positive decimal integer to be added.
The second line will take the second positive decimal integer to be added.
Output: The output should contain the sum of the two positive decimal integers in the binary format.
Sample test case for the above-given tree:
Input:
5
7
Output:
1100
Explanation:
The first line of the input is 5 which indicates the first decimal integer.
Next line of input is 7 which represents the decimal binary integer seven.
The sum of the inputs given above is 12 which means the output should be the binary representation of 12 i.e. 1100
 */
public class GenerateAddBinary {

        static String generatePrintBinary(int n) {

            if (n == 0) {
                String s = "0";
                return s;
            } else {
                // Create an empty queue of strings
                Queue<String> queue = new LinkedList<String>();

                // Enqueue the first binary number
                queue.add("1");

                for (int i = 0; i < n - 1; i++) {

                    // print the front of queue
                    String s1 = queue.peek();
                    queue.remove();
                    // Store s1 before changing it
                    String s2 = s1;

                    // Append "0" to s1 and enqueue it
                    queue.add(s1 + "0");

                    // Append "1" to s2 and enqueue it. Note that s2 contains
                    // the previous front
                    queue.add(s2 + "1");
                }
                String st = queue.peek();
                return st;
            }
        }

    public String binaryAddition(String s1, String s2) {
        if (s1 == "0" && s2 == "0") return "0";
        else if (s1 == "0") return s2;
        else if (s2 == "0") return s1;
        int first = s1.length() - 1;
        int second = s2.length() - 1;
        /*Implementing string builder class*/
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += s1.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += s2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        return String.valueOf(sb);
    }


    public static void main(String[] args) {
            GenerateAddBinary obj = new GenerateAddBinary();
            String first = "";
            String second = " ";
            String result = " ";
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            first = obj.generatePrintBinary(n);
            int m = in.nextInt();
            second = obj.generatePrintBinary(m);
            result = obj.binaryAddition(first, second);
            System.out.println(result);
        }
    }



