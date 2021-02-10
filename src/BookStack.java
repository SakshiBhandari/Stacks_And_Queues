import java.util.Scanner;
import java.util.Stack;
/*You are given 4 books. You are required to place them in a stack, and then pick the book at the top and
read 100 pages of it. The book object contains a title and the number of pages which you have to read.
In a single reading session, you can only read 100 pages. After a book is completed, remove it from the stack,
 and then begin reading the book that is now at the top of the stack.
Write a program that would first push the books into the stack, and then read all the books one by one, 100 pages at a time
You will define a stack of Book objects as:
Stack<Book> bookStack = new Stack<Book>();
*/
public class BookStack {

        public String title;
        public int pagesLeft;

        public BookStack(String title, int pages) {
            this.title = title;
            this.pagesLeft = pages;
        }

        public String getTitle() {
            return this.title;
        }

        public int getPages() {
            return this.pagesLeft;
        }

        public void read100Pages() {
            System.out.println("Reading 100 pages of " + this.title);
            this.pagesLeft = this.pagesLeft - 100;
        }

        public Boolean completed() {
            return this.pagesLeft <= 0;
        }
    }

    class Source {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BookStack book1 = new BookStack("Harry Potter", 200);
            BookStack book2 = new BookStack("Champak", 100);
            BookStack book3 = new BookStack("Lord of the Rings", 300);
            BookStack book4 = new BookStack("Tinkle", 100);


            Stack<BookStack> bookStack = new Stack<BookStack>();
            // Add code to push the books on the Stack here (in order:
            // book1,book2,book3,book4)
            bookStack.push(book1);
            bookStack.push(book2);
            bookStack.push(book3);
            bookStack.push(book4);

            // reading and subsequently removing the books
            while (!bookStack.isEmpty()) {
                BookStack topBook = bookStack.peek();
                while (!(topBook.completed())) {
                    topBook.read100Pages();
                }
                bookStack.pop();
            }
        }
    }
