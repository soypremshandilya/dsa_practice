import java.util.*;
public class isPalindromeSB {
  public static void main(String[] args) {
    String str = "malayalam";
    StringBuilder rev = new StringBuilder(str);
    rev.reverse();
    if(rev.toString().equals(str)){
    System.out.println("It is Palindrome");
    }
    else{
      System.out.println("It is not a Palindrome");
    }
  }
}
