package homework11.cloth;

public class ClothMain {

    public static void main(String[] args) {

        TailoringStudio tailoringStudio = new TailoringStudio();

        tailoringStudio.dressWoman(Storage.clothes);
        System.out.println("==========");

        tailoringStudio.dressMan(Storage.clothes);
    }
}

