package homework11.cloth;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.XS, 100, "Black"),
                new TShirt(Size.L, 200, "Blue"),
                new Trousers(Size.M, 300, "White"),
                new Trousers(Size.XXS, 400, "Grey"),
                new Skirt(Size.S, 500, "Pink"),
                new Skirt(Size.M, 600, "Orange"),
                new Tie(Size.L, 700, "Yellow"),
                new Tie(Size.L, 800, "Purple")
        };

        TailoringStudio tailoringStudio = new TailoringStudio();

        tailoringStudio.dressWoman(clothes);
        System.out.println("==========");

        tailoringStudio.dressMan(clothes);
//        System.out.println("==========");
//
//        tailoringStudio.dressWomanToSting(clothes);
//
//        tailoringStudio.dressManToSting(clothes);
//        System.out.println("==========");







    }
}

