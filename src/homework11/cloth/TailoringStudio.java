package homework11.cloth;

public class TailoringStudio {

    public void dressWoman(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenCloth) {
                System.out.println(cloth.getSize() + " ,price: " + cloth.getPrice() + " ,color: " + cloth.getColor() );
                getInfo();
                System.out.println("----------------");
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof ManCloth) {
                getClothName();
                System.out.println(cloth.getSize() + " " + cloth.getPrice() + " " + cloth.getColor());
                getInfo();
                System.out.println("----------------");
            }
        }
    }

    public String getClothName() {
        String info = "";
        for (Size size : Size.values()) {
            return size.name();
        }
        return info;
    }

    public String getInfo() {
        String info = "";
        for (Size size : Size.values()) {
            return size.getEuroSize() + " " + size.getDescription();
        }
        return info;
    }

    public void dressWomanToSting(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenCloth) {
                System.out.println(cloth);
                System.out.println("----------------");
            }
        }
    }

    public void dressManToSting(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof ManCloth) {
                System.out.println(cloth);
                System.out.println("----------------");
            }
        }
    }

}