package homework11;

/*
Create enum Dish with food positions available in the Restaurant, ie FOIE_GRAS, BEUF_BOURGUIGNON, QUICHE_LORRAINE, TARTE_TATIN
Add fields: String name, int price, int preparationTime. Name is a String representation of your dish, ie “Quiche Lorraine” for QUICHE_LORRAINE
Add abstract method ingredients(); Override it for each element of the enum, it has to print out ingredients for the respective dish.
Add method getCategory() that returns String “Main Dish” by default. Override this method for the dishes that are not Main Dish (ie “Starter” for FOIE_GRAS, “Dessert” for TARTE_TATIN etc)
Create class Restaurant. Add method printMenu() which will display menu contents in a format:
      Category
      Dish name Dish price
      Ingredients

Add method selectDish(Dish dish). Print out message with selected dish and expected time
 of its preparation
 */

public enum Drink {

    NEGRONI("Negroni cocktail", 250, 5) {
        @Override
        public void ingredients() {
            System.out.println("Negroni ingredients");
        }
        @Override
        public void getCategory() {
            System.out.println("Not main drink");
        }
    },
    SOUR ("New York Sour cocktail", 200, 7){
        @Override
        public void ingredients() {
            System.out.println("Sour ingredients: Bourbon whiskey + Lemon juice + Simple syrup + Red wine");
        }
    },
    APEROL("Aperol Spritz cocktail", 180, 3) {
        @Override
        public void ingredients() {
            System.out.println("Aperol ingredients");
        }
    };

    private String name;
    private int price;
    private int preparationTime;

    Drink(String name, int price, int preparationTime) {
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    abstract void ingredients();

    public void getCategory() {
        System.out.println("Main drink");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }
}
