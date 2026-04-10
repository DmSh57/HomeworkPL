package homework8;

import java.util.HashMap;
import java.util.Map;

public class Homewwork8_3 {
    public static Map<String, Boolean> wordMultiple(String[] letters) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> countResult = new HashMap<>();
        for (String letter : letters) {
            if (countResult.containsKey(letter)) {
                countResult.put(letter, countResult.get(letter) + 1);
            } else {
                countResult.put(letter, 1);
            }
        }
        for (String letter : countResult.keySet()) {
            result.put(letter, countResult.get(letter) >= 2);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] testLetter = {"a", "b", "c", "c"};
        System.out.println(wordMultiple(testLetter));

        String[] testLetter1 = {"a", "b", "c", "c", "a", "b"};
        System.out.println(wordMultiple(testLetter1));
    }
}
