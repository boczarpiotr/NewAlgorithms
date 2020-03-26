import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumsSmallerThan {

    public int[] smallerNums(int[] nums) {

        int[] tab = new int[nums.length];

        int outPutNumber;
        for (int i = 0; i < nums.length; i++) {
            outPutNumber = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i != j) && (nums[j] < nums[i])) {
                    outPutNumber++;
                }
            }
            tab[i] = outPutNumber;
        }
        return tab;
    }

    public static void main(String[] args) {
        int[] tab = {8, 1, 2, 2, 3};

        NumsSmallerThan numsSmallerThan = new NumsSmallerThan();
        System.out.println(Arrays.toString(numsSmallerThan.smallerNums(tab)));
    }
}
