import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> result = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j]==s){
                    int[] pair = new int[2];
                    if (arr[i] < arr[j]) {
                        pair[0] = arr[i];
                        pair[1] = arr[j];
                    } else {
                        pair[0] = arr[j];
                        pair[1] = arr[i];
                    }
                    result.add(pair);
                }
            }
        }
        result.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        
        return result;
    }
}
