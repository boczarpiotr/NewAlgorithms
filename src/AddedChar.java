import java.util.HashMap;
import java.util.Map;

public class AddedChar {

    public static void main(String[] args) {

        String firsWord = "huj";
        String secondWord = "h0uj";

        char[] firstWordTab = firsWord.toCharArray();
        char[] secondWordTab = secondWord.toCharArray();

        Map<Character, Integer> firstWordCharOcc = new HashMap<>();
        Map<Character, Integer> secondWordCharOcc = new HashMap<>();

        for (int i = 0; i < firstWordTab.length; i++) {
            if (firstWordCharOcc.containsKey(firstWordTab[i])) {
                firstWordCharOcc.put(firstWordTab[i], firstWordCharOcc.get(firstWordTab[i]) + 1);
            } else {
                firstWordCharOcc.put(firstWordTab[i], 1);
            }
        }

        for (int i = 0; i < secondWordTab.length; i++) {
            if (secondWordCharOcc.containsKey(secondWordTab[i])) {
                secondWordCharOcc.put(secondWordTab[i], secondWordCharOcc.get(secondWordTab[i]) + 1);
            } else {
                secondWordCharOcc.put(secondWordTab[i], 1);
            }
        }
        char addedChar = ' ';
        for (int i = 0; i < secondWordTab.length; i++) {
            if (!(secondWordCharOcc.get(secondWordTab[i]) == firstWordCharOcc.get(secondWordTab[i]))) {
                addedChar = secondWordTab[i];
            }
        }
        System.out.println("Dodana znak to: " + addedChar);
    }
}

