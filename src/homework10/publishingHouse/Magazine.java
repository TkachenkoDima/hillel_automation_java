package homework10.publishingHouse;

public class Magazine implements Printable {

    public String name;
    public int circulation;

    public Magazine(String name, int circulation) {
        this.name = name;
        this.circulation = circulation;
    }

    public String getName() {
        return name;
    }

    public int getCirculation() {
        return circulation;
    }

    @Override
    public void print() {
        System.out.println("Start to printing magazine " + getName() + " with " + getCirculation() + " circulation amount.");
    }

    @Override
    public void printOnlyNames() {
        System.out.println("Magazine name: " + getName());
    }

    static void printMagazines(Printable[] printable) {
        for (Printable i: printable) {
            if (i instanceof Magazine)
                i.printOnlyNames();
        }
    }
}
