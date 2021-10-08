package homework12_Exception.Task3_Weather;

public class Weather {
    public static void main(String[] args) {
        isWeatherGood(true,true,10);
    }

    public static void isWeatherGood(boolean isItRaining, boolean isItSunny, int temperature) {
        try {
            if (!isItRaining && isItSunny && temperature >= 10) {
                System.out.println("Nice weather for walking outside.");
            }
            else {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Gotcha! Weather is not good." + ex);;
        }
    }
}