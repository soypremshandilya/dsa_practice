public class maxOfArray {
  public static void main(String[] args) {
    int[] arr = {110, 22, 35, 453, 51};
    int max = arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i]>max) max = arr[i];
    }
    System.out.println(max);
  }
}
