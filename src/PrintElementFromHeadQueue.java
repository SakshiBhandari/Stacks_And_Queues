import java.util.*;
/*You are given a queue with n integers and you need to print the fifth element from the head of the queue
Input format:
The first line of input is an integer n denoting the size of the queue. The next line  contains n space separated integer.
Output format:
An integer which is the fifth element from head of the queue.
Example:
Queue = [1, 2, 3, 4, 5, 6, 7, 8]
Output: 5
Sample Input 1:
12
1 2 3 4 5 6 7 8 9 10 11 12
Note: If the number of elements in the queue is less than 5, then print “There are not enough elements in the queue”.
*/
public class PrintElementFromHeadQueue {

    public static void main(String args[]) {
            Queue<Integer> queue = new LinkedList<Integer>();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            while (n-- > 0)
                queue.add(s.nextInt());
            printFifthElementFromStart(queue);
        }

        // Method to print the fifth element from the head of the queue
        static void printFifthElementFromStart(Queue<Integer> queue) {
            // Write your code here
            int n = queue.size();
            // If the stack doesn't have enough elements
            if (n < 5)
                System.out.println("There are not enough elements in the queue");
            else {
                for (int i = 0; i < 4; i++) {
                    queue.remove();
                }
                System.out.println(queue.peek());
            }
        }
    }
