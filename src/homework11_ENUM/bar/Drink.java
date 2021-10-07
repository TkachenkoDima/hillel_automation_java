package homework11_ENUM.bar;

public enum Drink {

    NEGRONI("Negroni cocktail", 250, 5) {
        @Override
        public void ingredients() {
            System.out.println("Negroni ingredients: 1 ounce gin + 1 ounce Campari + 1 ounce sweet vermouth and Garnish: orange peel");
        }
        @Override
        public void getCategory() {
            System.out.println("This cocktail not in main menu");
        }
    },
    SOUR ("New York Sour cocktail", 200, 7){
        @Override
        public void ingredients() {
            System.out.println("Sour ingredients: 2 ounces rye whiskey or bourbon + 1 ounce lemon juice + 3/4 ounce simple syrup + 1 egg white + 1/2 ounce red wine");
        }
    },
    APEROL("Aperol Spritz cocktail", 180, 3) {
        @Override
        public void ingredients() {
            System.out.println("Aperol ingredients: Equal parts Aperol + equal parts Cinzano Prosecco + splash of Soda");
        }
    };

    private final String name;
    private final int price;
    private final int preparationTime;

    Drink(String name, int price, int preparationTime) {
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    abstract void ingredients();

    public void getCategory() {
        System.out.println("Main menu");
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
