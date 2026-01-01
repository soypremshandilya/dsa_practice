
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check if its in the Array: ");
    int x = sc.nextInt();
    int[] arr = {1, 2, 3, 4, 5};
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        System.out.println(i);
        break; 
      }
      
    }
    sc.close();
  }
}