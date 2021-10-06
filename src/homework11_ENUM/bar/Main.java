package homework11_ENUM.bar;

public class Main {
    public static void main(String[] args) {

        Bar bar = new Bar();

        bar.printMenu();
        bar.selectDrink(Drink.NEGRONI);
    }
}
