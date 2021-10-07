package homework5_Methods;

public class Task8_HW5 {

    public static void main(String[] args) {
        printRectangle(3, 3);
    }

    public static void printRectangle(int width, int height) {
        int i;
        int j;
        for ( i = 0; i < height; i++ ) {
            for ( j = 0; j < width; j++) {
                printStars();
            }
            System.out.println("");
        }
    }

    public static void printStars() {
        System.out.print("*");
    }
}