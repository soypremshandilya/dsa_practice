import java.util.Arrays;

public class SumArray {

    public static int[] checkSum(int input1, int[] input2, int input3) {
        int sum = 0;

        for (int i = 0; i < input1; i++) {
            sum += input2[i];
        }

        if (sum == input3) {
            return input2;
        } else {
            return new int[]{-1};
        }
    }

    public static void main(String[] args) {
        int input1 = 3;
        int[] input2 = {1, 2, 3, 4};
        int input3 = 6;

        int[] result = checkSum(input1, input2, input3);
        System.out.println(Arrays.toString(result));
    }
}
