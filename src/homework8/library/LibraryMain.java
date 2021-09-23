package homework8.library;

import homework8.student.Student;

public class LibraryMain {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Kek Ololoev", 1, "1-st", "28.11", "73238827");
        Reader reader2 = new Reader("Mr. Smith", 2, "2-nd", "01 Jan 1990", "+31413");
        Reader reader3 = new Reader("John Doe", 3, "3-rd", "29.02.2000", null);

        Book book1 = new Book ("Atlas shrugged", "Ayn Rand");
        Book book2 = new Book ("The Source", "Ayn Rand");
        Book book3 = new Book ("The Girl on the Train", "Paula Hawkins");

        reader1.takeBook(2);
        reader2.takeBook("Adventure book", "Vocabulary");
        reader3.takeBook(book1, book2, book3);

        reader1.returnBook(1);
        reader2.returnBook("Encyclopedia");
        reader3.returnBook(book2, book3);
    }
}
