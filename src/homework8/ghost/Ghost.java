package homework8.ghost;

import java.util.concurrent.ThreadLocalRandom;

public class Ghost {
    String color;
    String[] arr = {"White", "Green", "Blue", "Red", "Pink"};

    public Ghost(){
        this.color = arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }

    public String getColor(){
        return this.color;
    }
}
