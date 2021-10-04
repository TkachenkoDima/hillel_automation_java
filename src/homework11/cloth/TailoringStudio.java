package homework11.cloth;

public class TailoringStudio {

    public void dressWoman(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenCloth) {
                System.out.println(cloth.clothName());
                sizeInfo(cloth);
                System.out.println("Price: " + cloth.getPrice());
                System.out.println("Color: " + cloth.getColor());
                System.out.println("----------------");
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof ManCloth) {
                System.out.println(cloth.clothName());
                sizeInfo(cloth);
                System.out.println("Price: " + cloth.getPrice());
                System.out.println("Color: " + cloth.getColor());
                System.out.println("----------------");
            }
        }
    }

    public void sizeInfo(Clothes clothes) {
        System.out.println(clothes.getSize() + " " + clothes.getSize().getEuroSize() + " " + clothes.getSize().getDescription());
    }
}
