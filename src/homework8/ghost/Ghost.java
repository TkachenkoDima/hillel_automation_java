package homework8.ghost;

import java.util.concurrent.ThreadLocalRandom;

public class Ghost {

    public Ghost() {
    }

    public String getColor() {
        String[] arr = {"White", "Green", "Blue", "Red", "Pink"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        return arr[randIdx];
    }
}



