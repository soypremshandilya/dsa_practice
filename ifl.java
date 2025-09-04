import java.util.Scanner;
class ifl{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.print("Factorial of number: ");
    int n = sc.nextInt();
    int Factorial = 1;
    for(int i = 1; i <= n; i++) {
        Factorial = Factorial * i; 
    }
    if (Factorial < 100) {
        System.out.println("The factorial is less than 100.");
    } else {
        System.out.println(Factorial);
    }
    
  }
}