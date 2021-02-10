import java.util.*;
/*Write a code to find the kth largest number of the given sequence in a stack. Your program should take the following lines of input:
The number of elements in the input stack.
The elements in the input stack.
The value of ‘k’.
Note:
If the input stack is empty, your program should print “ stack is empty”.
If the value of ‘k’ is greater than the number of elements in the input stack, then print “ invalid input”
Sample Input 1:
6
4 2 0 9 6 1
4  // k=4, therefore, the 4th largest element has to be found
Sample Output 1:
2
Sample Input 2:
6
1 2 3 4 5 6
2 // k=2 , therefore the 2nd largest element has to be found
Sample Output 2:
5
*/
public class KthLargestElementStack {
        // This function returns the sorted stack
        public static Stack < Integer > sortStack(Stack < Integer > input) {
            //write your code here\
                Stack <Integer> temp = new Stack <>();

                while (!input.isEmpty()) {
                    // pop out the top element in stack
                    int value = input.pop();

                    // while temporary stack is not empty and value of the top element of input stack is less than the value of the top element of temp stack
                    while (!temp.isEmpty() && value < temp.peek()) {
                        // pop the last element from temporary stack and push it to the input stack
                        input.push(temp.pop());
                    }

                    // push value in the temp stack
                    temp.push(value);
                }
                return temp;
            }

            public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
                int j = 1;
                while (j < k) {
                    sortedStack.pop();
                    j++;
                }
                System.out.println(sortedStack.peek());
            }


            public static void main(String args[]) {
                Stack < Integer > inputStack = new Stack < Integer > ();
                Scanner in = new Scanner(System.in);
                int n = in .nextInt();
                for (int i = 0; i < n; i++) {
                    inputStack.add( in .nextInt());
                }

                if (inputStack.isEmpty()) {
                    System.out.println("stack is empty");
                    System.exit(0);
                }

                int k = in .nextInt();
                if (k > inputStack.size()) {
                    System.out.println("invalid input");
                    System.exit(0);
                }

                // This is the temporary stack

                Stack < Integer > temp = sortStack(inputStack);
                findKthLargestNum(temp, k);

            }
        }
