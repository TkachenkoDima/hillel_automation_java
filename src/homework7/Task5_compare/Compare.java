package homework7.Task5_compare;

public class Compare {
    public static void main(String... o) {

        Bikes bike1 = new Bikes("Scott", 17);
        Bikes bike2 = new Bikes("Scott", 17);
        OtherBikes bike3 = new OtherBikes("Scott", 17);
        OtherBikes bike4 = new OtherBikes("Scott", 17);

        System.out.println("hashcode of bike1 = " + bike1.hashCode());
        System.out.println("hashcode of bike2 = " + bike2.hashCode());
        System.out.println("hashcode of bike1 = " + bike3.hashCode());
        System.out.println("hashcode of bike2 = " + bike4.hashCode());
        System.out.println("Comparing objects bike1 equals bike2: " + bike1.equals(bike2));
        System.out.println("Comparing objects bike1 equals bike3: " + bike1.equals(bike3) );
        System.out.println("Comparing objects bike1 == bike2: " + (bike1 == bike2));
        System.out.println("Comparing objects bike3 equals bike4: " + bike3.equals(bike4));
    }
}
