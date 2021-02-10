import java.util.*;
/*Write a program to implement the basic methods of stack i.e. push( ) and pop( ) using a single queue.
Your program should take the following lines of input:
The number of elements you want to insert in the stack.
Elements of the stack.
 Note:
If there are no elements in the stack then, print “ Stack is empty”
The stub code consists of the print statements in the main method that would first display the topmost
element in the original stack then the topmost element after one pop( ) operation.
Sample Input:
6
1 2 3 4 5 6
Sample Output:
6
5

Sample Input:
0
Sample Output;
Stack is empty


 */
public class StackUsingSingleQueue {
        /*implementing queue using linked list */
        Queue < Integer > q = new LinkedList < Integer > ();

        /* Push operation of stack using queue*/
        void push(int x) {
            //write your code here

                int size = q.size();

                /* Add new element in the queue */
                q.add(x);

                /* Pop (or Dequeue) all previous elements and put them after current element */

                for (int i = 0; i < size; i++) {
                    /* this will remove the head element and add it to the tail element */
                    int temp = q.remove();
                    q.add(temp);
                }
            }

            /*Removes the top element of the stack*/

            int pop () {
                if (q.isEmpty()) {
                    System.out.println("Stack is empty");
                    System.exit(0);
                }
                int x = q.remove();
                return x;
            }


            /*Returns the element at the top of the stack */
            int top () {
                if (q.isEmpty()) {
                    System.out.println("Stack is empty");
                    System.exit(0);
                }
                return q.peek();
            }

    public static void main(String[] args) {
        StackUsingSingleQueue obj = new StackUsingSingleQueue();
            Scanner in = new Scanner(System.in);

            /*Enter the number of elements you want to add in the stack */

            int n = in .nextInt();

            /*Enter the elements of the stack */
            for (int i = 0; i < n; i++) {
                obj.push( in .nextInt());
            }

            System.out.println(obj.top());
            obj.pop();
            System.out.println(obj.top());
        }
    }
