import java.util.Scanner;
public class linearSearchwa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x  = sc.nextInt();
    int[] arr = {1, 2, 3, 4, 5};
    boolean flag = false;
    for(int i = 0; i< arr.length; i++){
      if(arr[i]==x){
        flag = true;
        break;
      }
    }
    if(flag == true){
      System.out.println("Element is present in array");
    }
    else {
      System.out.println("Element is not present in array");
    }
  }
}
