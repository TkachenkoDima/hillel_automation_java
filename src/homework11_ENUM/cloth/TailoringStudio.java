package homework11_ENUM.cloth;

public class TailoringStudio {

    public void dressWoman(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenCloth) {
                System.out.println(cloth.clothName());
                sizeInfo(cloth.getSize());
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
                sizeInfo(cloth.getSize());
                System.out.println("Price: " + cloth.getPrice());
                System.out.println("Color: " + cloth.getColor());
                System.out.println("----------------");
            }
        }
    }

    public void sizeInfo(Size size) {
        System.out.println("Size: " + size + " (euro size: " + size.getEuroSize() + ") -> " + size.getDescription());
    }
}
