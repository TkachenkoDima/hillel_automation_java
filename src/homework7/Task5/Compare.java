package homework7.Task5;

public class Compare {
    public static void main(String... o) {

        Bikes scott = new Bikes("scott", 50);
        System.out.println(scott.equals(new Bikes("scott",50)));

        Bikes specialized = new Bikes("specialized", 52);
        System.out.println(specialized.equals(new Bikes("specialized", 52)));

        Bikes focus = new Bikes("focus", 54);
        System.out.println(focus.equals(new Object()));
    }
}
