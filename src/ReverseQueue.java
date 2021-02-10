import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*You are given a queue. Your aim is to reverse that queue.
 Input Format:
The first line of input is an integer n denoting the size of the queue. The next line contains n space separated integers.
Output Format:
The output should be reverse of the input queue.
Example: if the queue contains [9, 6, 8, 2, 5] then you have to make some changes to the queue such that after making
the required changes the queue should look like [5, 2, 8, 6, 9].
Sample Input:
6
8 1 9 2 5 3
Sample Output:
[3, 5, 2, 9, 1, 8]
Note: The queue in the below program is named as ‘q’. You can use another stack or queue if you want.
*/

public class ReverseQueue {

        static Queue<Integer> q = new LinkedList<Integer>();

    static void Print()
    {
        while (!q.isEmpty()) {
            System.out.print( q.peek() + ", ");
            q.remove();
        }
    }
    public static void func() {
            //write your code here
            Stack<Integer> stack = new Stack<>();
            while (!q.isEmpty()) {
                stack.add(q.peek());
                q.remove();
            }
            while (!stack.isEmpty()) {
                q.add(stack.peek());
                stack.pop();
            }
        }

    public static void main(String arg[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                q.add(in.nextInt());
            }
            func();
            System.out.println(q);
        }
    }


