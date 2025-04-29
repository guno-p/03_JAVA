package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("1번 책"));
        bookShelf.appendBook(new Book("2번 책"));
        bookShelf.appendBook(new Book("3번 책"));
        bookShelf.appendBook(new Book("4번 책"));

        // 명시적 Iterator 사용
        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for(Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
