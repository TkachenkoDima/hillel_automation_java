package homework8.library;

public class Reader {

    private String fullname;
    private int libraryCardNumber;
    private String faculty;
    private String birthdate;
    private String phoneNumber;

    public Reader() {
    }

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

