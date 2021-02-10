import java.util.*;
/*You are given an array of 'n' integers and a positive integer ‘g’. Write a program using a Dequeue to find the maximum number
for each of the contiguous sub-arrays of size ‘g’.
Constraints: The time complexity of your solution code should be O(n) and space complexity should not be more than O(g),
where ‘g’ is the size of sub-arrays.
Input:  Your program should take three lines of input in the following format
The first line will be ‘n’ representing the number of elements in the array.
 Next line will be 'n' elements separated by space representing the elements of the input array.
The third line will positive integer ‘g’ i.e the size of the sub-arrays.
Note:
If the input array is empty then print, “the array is empty”.
If the value of g is greater than the number of the elements in the array, then print    “the size of subgroup exceeds the number of elements in the array “
Output: The output should display the maximum number for each sub array of size 'g.'
Sample test case for the above-given input array is:
Input:
8
3 2 8 5 7 1 9 0
3
Output:
 8 8 8 7 9 9
Explanation:
The first line of the input is 8 which indicates the number of elements in the input array.
Next line consists of 8 integers representing the  elements on the input array.
Third line is the size of sub-arrays 'g' which is 3
In the given array the first sub-array of size three consists of elements 3 2 8  and maximum
among them is 8; therefore 8 is displayed. Next sub-array of size '3' is 2 8 5, and the maximum of
the three is again 8, so 8 is shown. Similarly, the maximum of all the other sub-arrays is displayed as output.
*/
public class MaximumOfEachSubarray {

        static void max(int arr[], int n, int g) {
            //Write your code here
            Deque<Integer> deque = new LinkedList<>();

            //Step 1: handle first k elements in sliding window
            for (int i = 0; i <g ; i++) {
                //remove all the elements which are smaller than the current elements
                while(deque.isEmpty()==false && arr[deque.peekLast()]<=arr[i])
                    deque.removeLast();
                //add new element at the end
                deque.addLast(i);
            }

            //Step 2: handle rest of the element, one at a time nums[k] to nums[n-1]
            for (int i = g; i <arr.length ; i++) {

                //before we do anything, print the first element in deque
                //since its a maximum among previous k elements
                System.out.print(arr[deque.peekFirst()] + " ");

                //Now remove the elements which are out for next window (next k elements)
                while(deque.isEmpty()==false && deque.peekFirst()<=i-g)
                    deque.removeFirst();

                //Add the next element in the window = index i
                //remove all the elements which are smaller than the next element = index i
                while(deque.isEmpty()==false && arr[deque.peekLast()]<=arr[i])
                    deque.removeLast();
                //add new element at the end
                deque.addLast(i);
            }
            //to print the last max element
            System.out.print(arr[deque.peekFirst()] + " ");
        }
public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int g = in.nextInt();
            if(arr.length==0 ){
                System.out.println("the array is empty");
            }
            else if (g > n){
                System.out.println("the size of subgroup exceeds the number of elements in the array");
            }
            max(arr, n, g);
        }
    }


