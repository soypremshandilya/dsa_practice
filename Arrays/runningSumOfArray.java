public class runningSumOfArray {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int[] run = new int[arr.length];
    run[0] = arr[0];

    for(int i = 1; i<arr.length; i++){
      run[i] = arr[i] + run[i-1];
    }
    for(int i =0; i<run.length; i++){
      System.out.println(run[i]+"");
    }
  }
}
