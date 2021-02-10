public class StackUsingArray {
   private int capacity;
   private int [] arr;
   private int top;

   public StackUsingArray(int capacity){
       top = -1;
       this.capacity = capacity;
       arr = new int[capacity];

   }
   public boolean isEmpty(){
       if (top == -1){
           return true;
       }
       else{
           return false;
       }
   }
   public boolean isStackFull(){
       if(top == (capacity-1)){
           return true;
       }
       else{
           return false;
       }
   }
   public void push(int number) {
       if (top == (capacity-1)) {
           System.out.println("Stack is full");
       }
       else {
           top++;
           arr[top] = number;
       }
   }
   public void pop(){
       if(!isEmpty()){
           top--;
       }
       else {
           System.out.println("Cannot pop from empty stack");
       }
   }
   public int peek(){
       return arr[top];
   }

   public static void main(String[]args){
       StackUsingArray stack = new StackUsingArray(5);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(6);
       stack.push(7);
       System.out.println(stack.isEmpty());
       System.out.println(stack.peek());
       stack.pop();
       System.out.println(stack.isStackFull());
   }
}
