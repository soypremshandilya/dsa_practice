import java.util.Arrays;
public class shuffleTheArray {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6};
    int n = 3;

    int[] result = new int[nums.length];
    int index = 0;

    for(int i = 0; i < n; i++){
      result[index++] = nums[i];
      result[index++] = nums[i + n];
    }
    System.out.println(Arrays.toString(result));
  }
}
