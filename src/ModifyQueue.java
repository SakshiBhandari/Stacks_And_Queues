import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Queue;

public class ModifyQueue {

// In java, you can use an inbuilt Queue using the Linked class
// Here, the convention changes a bit -
// Java queues don't have enqueue and dequeue methods; these operations are carried out using the following methods:
// Enqueuing: add(x), Throws an exception if it fails to insert the object, i.e. when the queue is full
// Dequeuing: remove(), Throws an exception if the queue is empty
// peek(): Returns the head of the queue. It would return null if the queue is empty
// isEmpty(): Returns true if the queue is empty
// You may read more here - https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html

        public static void main(String[] args) {
            Queue numbers = new LinkedList();
            List(numbers);

            // remove previous elements of queue
            while(!numbers.isEmpty()) {
                numbers.remove();
            }
            // add elements to queue
            numbers.add(1);
            numbers.add(4);
            numbers.add(9);
            numbers.add(14);
            numbers.add(15);

            System.out.println(numbers);
        }

        public static void List(Queue numbers) {
            int i = 0;
            while(i <= 12) {
                if(i%2==0) {
                    numbers.add(i);
                }
                i++;
            }
        }

    }

