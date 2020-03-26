import java.util.HashMap;
import java.util.Map;


public class AddedCharV2 {
    public static void main(String[] args) {

        String firsWord = "book";
        String secondWord = "bouok";
        char addedLetter = ' ';

        char[] firstWordTab = firsWord.toCharArray();
        char[] secondWordTab = secondWord.toCharArray();

        Map<Character, Integer> firstWordCharOcc = new HashMap<>();

        for (int i = 0; i < firstWordTab.length; i++) {
            if (firstWordCharOcc.containsKey(firstWordTab[i])) {
                firstWordCharOcc.put(firstWordTab[i], firstWordCharOcc.get(firstWordTab[i]) + 1);
            } else {
                firstWordCharOcc.put(firstWordTab[i], 1);
            }
        }
        for (int i = 0; i < secondWordTab.length; i++) {
            if (!(firstWordCharOcc.containsKey(secondWordTab[i]))) {
                firstWordCharOcc.put(secondWordTab[i], -1);
            } else {
                firstWordCharOcc.put(secondWordTab[i], firstWordCharOcc.get(secondWordTab[i]) - 1);
            }
        }
        for (int i = 0; i < secondWordTab.length; i++) {
            if (firstWordCharOcc.get(secondWordTab[i]) < 0) {
                addedLetter = secondWordTab[i];
            }
        }
        System.out.println(addedLetter);
    }
}
