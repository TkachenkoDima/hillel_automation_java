package homework11_ENUM.bar;

public class Bar {

    public void printMenu() {

        for (Drink drink : Drink.values()) {
            drink.getCategory();
            System.out.println("Name: " + drink.getName() + " , Price " + drink.getPrice() + " UAH");
            drink.ingredients();
            System.out.println();
        }
    }

    public void selectDrink(Drink drink) {
        System.out.println(drink.getName() + " -> " + drink.getPreparationTime() + " minutes to prepare.");
    }
}
