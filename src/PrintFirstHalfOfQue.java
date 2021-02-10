import java.util.*;
/*You are given a stack with n integers. You need to delete floor(n/2) elements from the bottom of the stack and print the
 remaining elements of the stack. The remaining elements should be printed in the order that they are inserted into the stack.
floor(3.5) will give the output as 3, greatest integer less than or equal to the input.
Input Format:
The first line of input is an integer n denoting the size of stack. The next line contains n space separated integers.
Output Format:
The remaining elements of the stack after removal of the required elements.
Example:
Stack(bottom -> top) = [1, 2, 3, 4, 5, 6]
Output: [4, 5, 6]
Stack = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Output: [6, 7, 8, 9, 10, 11]
Sample Input:
12
1 2 3 4 5 6 7 8 9 10 11 12
Sample Output:
[7, 8, 9, 10, 11, 12]
Note: You can use extra stack if needed.
*/
public class PrintFirstHalfOfQue {
    static void deleteFirstHalf(Stack<Integer> stack, int n, int curr) {
        if (stack.empty() || curr == n) {
            return;
        }
        int x = stack.pop();

        deleteFirstHalf(stack, n, curr + 1);
        if (curr < n / 2 + n % 2) {
            stack.push(x);
        }
    }
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack, stack.size(), 0);
        System.out.println(stack);
    }
}
