package EstambreApp;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * mazeCration
 */
public class MazeCreation {

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>() {{
                add(1);
                add(2);
                add(2);
        }};

        Map<Integer, Integer> hello = new HashMap<Integer, Integer>() {{
            put(1, 10);
            put(2, 20);
        }};

        System.out.println(arr);
        System.out.println(hello);
    }
}