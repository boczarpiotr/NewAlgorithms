import java.util.*;

public class SmallestIntNotInArray {
    public static void main(String[] args) {

        int[] tab = {6, 7, 2, 9, 1};

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < tab.length; i++) {
            hashSet.add(tab[i]);
        }
        for (int i = 1; i < tab.length; i++) {
            if (!(hashSet.contains(i))){
                System.out.println(i);
                break;
            }
        }
    }
}



