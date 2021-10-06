package homework10_Interfaces.publishingHouse;

public class Book implements Printable {

    public String name;
    public int pagesCount;

    public Book(String name, int pagesCount) {
        this.name = name;
        this.pagesCount = pagesCount;
    }

    public String getName() {
        return name;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public void print() {
        System.out.println("Start to printing book " + getName() + " with " + getPagesCount() + " pages count each book.");
    }

    @Override
    public void printOnlyNames() {
        System.out.println("Book name: " + getName());
    }

    static void printBooks(Printable[] printable) {
        for (Printable i: printable) {
            if (i instanceof Book)
                i.printOnlyNames();
        }
    }
}
