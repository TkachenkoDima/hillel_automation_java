package homework11;

public class Main {
    public static void main(String[] args) {

        for (Drink drink : Drink.values()) {
            printMenu(drink);
        }

        selectDrink(Drink.NEGRONI);
    }

    public static void printMenu(Drink drink) {
        drink.getCategory();
        System.out.println("Name: " + drink.getName() + " , Price " + drink.getPrice() + " UAH");
        drink.ingredients();
        System.out.println();
    }

    public static void selectDrink(Drink drink) {
        System.out.println(drink.getName() + " " + drink.getPreparationTime() + " min");
    }
}
