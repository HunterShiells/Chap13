
package ClassExamples;
import java.util.*;
public class ListIteratorEx2 {
    public static void main(String[] args) {
        ArrayList<Book> b = new ArrayList();
        ListIterator books = b.listIterator();
        books.add(new Book("It", "Stephen King"));
        books.add(new Book("Davinci Code", "Dan Brown"));
        books.add(new Book("Air Force 1", "Tom Clancey"));
        
        System.out.println("Rewind to beginning");
        while(books.hasPrevious()){
            System.out.println(books.previous());
        }
        System.out.println(books.hasPrevious());
        Book temp = new Book("Losing Weight", "Jenny Craig");
        System.out.println("Inserting " + temp + " at 3rd spot");
        books.next();
        books.next();
        books.add(temp);
        System.out.println("Deleting Davinci Code");
        books.previous();
        books.previous();
        books.remove();
        System.out.println("Final List");
        while(books.hasPrevious()){
         books.previous();
        }
        while(books.hasNext()){
            System.out.println(books.next());
        }
    }
    
}
