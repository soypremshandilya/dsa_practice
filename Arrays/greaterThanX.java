import java.util.Scanner;
public class greaterThanX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {11,34,56,34,76,46,35,37,57};
    System.out.println("Enter the Number: ");
    int x = sc.nextInt();
    int count = 0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]>x){
        count++;
      }
    }
    System.out.println(count);
  }
}
