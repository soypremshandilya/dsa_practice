class binarySearchDuplicates {
    static int firstOccurance(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        
        while (low <= high){
            
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    static int lastOccurance(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        
        while (low <= high){
            
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
        
    }
    
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,4,4,4,4,4};
        int target = 4;
        
        int first = firstOccurance(arr, target);
        int last = lastOccurance(arr, target);
        
        int Duplicates = last - first + 1;
        
        System.out.println("The target is repeated "+ Duplicates +" times");
    }
}