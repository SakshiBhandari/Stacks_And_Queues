import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;
/*You are given a queue with n integers. You need to sort the queue in ascending order such that the minimum value is
at the head of the queue. The expected input is the the number of elements and the elements of the queue, you need to
print the elements in the queue after they are sorted in ascending order.
Example:
Queue (head -> tail)= [6, 12, 3, 4, 5, 1, 7, 8, 10, 9, 11, 2]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Input Format:
12
6 12 3 4 5 1 7 8 10 9 11 2
Output format:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Note: You can use extra queue if needed.
*/
public class SortQueue {

    private static void sort(Queue<Integer> queue) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i = 0;
        int[] arr = new int[queue.size()];


        while (queue.size() > 0) {
            Integer removedNum = queue.remove();
            pq.add(removedNum);
        }

        while (pq.size() > 0) {
            Integer removedNum = pq.remove();
            arr[i] = removedNum;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }
}