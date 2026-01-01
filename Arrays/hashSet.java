import java.util.*;
public class hashSet {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);

    System.out.println(set);
    if(set.contains(50)){
      System.out.println("Element is Present");
    }
    if(!set.contains(70)){
      System.out.println("Set does not contain 70");
    }
    set.remove(50);
    if(!set.contains(50)){
      System.out.println("This set does not contain 50");
    }
  }
}
