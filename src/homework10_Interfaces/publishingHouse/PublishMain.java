package homework10_Interfaces.publishingHouse;

public class PublishMain {
    public static void main(String[] args) {

        Book book1 = new Book("Dark Tower", 4316);
        Book book2 = new Book("Season of Storms", 384);

        Magazine magazine1 = new Magazine("How to build DeathStar in pictures.", 1000);
        Magazine magazine2 = new Magazine("Manual - How to destroy DeathStar.", 500);

        Printable[] printables = {book1, book2, magazine1, magazine2};

        for (Printable printable : printables) {
            printable.print();
        }

        System.out.println();

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
