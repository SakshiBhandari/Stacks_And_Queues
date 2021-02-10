import java.util.*;
/*
Write a program to implement the basic methods of 'queue', i.e. enqueue( ) and
dequeue( ) using a single stack. The solution will perform the enqueue( ) function on the input elements and print the top 3
elements after calling the ‘Dequeue’ method three times on the given elements.
Constraint:  The time complexity of your code in the worst case should be O(n).
Input: Your program should  two lines of input
The first line should consist of 'n' which represents the number of elements you want to insert in the queue.
Next line will be n elements separated by space representing the elements to be inserted in the queue.
Note:
If there are no elements to dequeue then, print “ no elements left”
Output: the output should be in the following format:
First line should the first element that is dequeued.
Next line consists of the the second dequeued element.
Third line will print the third dequeued element.
Sample test cases:
Input:
6
1 2 3 4 5 6

Output:
1
2
3
*/
public class ImplementQusingStack {

    private Stack<Integer> stack = new Stack<Integer>();

    public void enQueue(int newData) {
        stack.push(newData);
        //System.out.println(newData);
    }

    public void deQueue() {
        if (stack.isEmpty()) {
            System.out.println("no elements left");
            return;
            }
        if (stack.size() == 1){
            int element = stack.pop();
            System.out.println(element);
            return;
        }
        int element = stack.pop();
        deQueue();
        stack.push(element);
    }
}
    class ImplementQ {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            ImplementQusingStack obj = new ImplementQusingStack();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                obj.enQueue(in.nextInt());

            }
            obj.deQueue();
            obj.deQueue();
            obj.deQueue();
        }
    }
