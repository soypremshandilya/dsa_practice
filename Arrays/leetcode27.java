public class leetcode27 {
  public static void main(String[] args) {
        int[] nums = {2,1,2,3,2,3,2,3};
        int val = 2;
        
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        System.out.println(left+"");
        System.out.println("New Array: ");
        for(int i = 0; i <nums.length; i++){
            System.out.println(nums[i]+"");
        }
        
    }
}
