package homework11;

public class Main {
    public static void main(String[] args) {
        for (Drink drink : Drink.values()) {
            printMenu(drink);
        }
    }

    public static void printNegroni() {
        Drink.NEGRONI.getCategory();
        Drink.NEGRONI.getName();
        Drink.NEGRONI.name();
        Drink.NEGRONI.getPrice();
        Drink.NEGRONI.ingredients();
    }

    public static void printMenu(Drink drink) {
        drink.getCategory();
        drink.getName();
        drink.getPrice();
        drink.ingredients();
        drink.getPreparationTime();
    }
}
