package homework8.presentationTasks;

public class Reader {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String birthdate;
    private int number;
    private int bookAmount;


    public Reader(String fullName, int cardNumber, String faculty, String birthdate, int number, int bookAmount) {
    }

   
    public int takeBook(int bookAmount) {
        return bookAmount;
    }

    public void returnBook() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

