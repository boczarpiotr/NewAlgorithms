import java.util.HashMap;
import java.util.Map;

public class Anagram {


    public static boolean ifAnagram(String t, String s) {
        char[] firstWord = t.toCharArray();
        char[] secondWord = s.toCharArray();

        Map<Character, Integer> firstWordLetterOcc = new HashMap<>();
        Map<Character, Integer> secondWordLetterOcc = new HashMap<>();


        countLetters(firstWord, firstWordLetterOcc);
        countLetters(secondWord, secondWordLetterOcc);

        if (firstWordLetterOcc.equals(secondWordLetterOcc)){
            return true;
        }
        return false;
    }

    private static void countLetters(char[] word, Map<Character, Integer> letterToOccurancy) {
        for (int i = 0; i < word.length; i++) {
            char currentLetter = word[i];
            if (letterToOccurancy.containsKey(currentLetter)){
                letterToOccurancy.put(currentLetter , letterToOccurancy.get(currentLetter) + 1);
            } else {
                letterToOccurancy.put(currentLetter, 1);
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(ifAnagram("papa" , "cdcd"));
    }
}
