package homework8_ClassesObjects.library;

public class Reader {

    private final String fullname;
    private final int libraryCardNumber;
    private final String faculty;
    private final String birthdate;
    private final String phoneNumber;

    public Reader(String fullname, int libraryCardNumber, String faculty, String birthdate, String phoneNumber) {
        this.fullname = fullname;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int number) {
        System.out.println(this.fullname + " take " + number + " books.");
        System.out.println();
    }

    public void takeBook(String...books) {
        System.out.println(this.fullname + " take books:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fullname + " take books:");
        for (Book book : books) {
            System.out.println(book.getName() + ", author - " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fullname + " return " + number + " books.");
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.println(this.fullname + " return books:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fullname + " return books:");
        for (Book book : books) {
            System.out.println(book.getName() + ", author - " + book.getAuthor());
        }
        System.out.println();
    }
}

