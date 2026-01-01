import java.util.*;
public class Hashing {
  public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("USA", 30);
        map.put("China", 140);
        map.put("Pakistan", 250);
        map.put("Bangladesh", 250);
        System.out.println(map+"");
        
        if(map.containsKey("India")){
            System.out.println("It is Present");
        }
        else{
            System.out.println("It is not Present");
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+"");
            System.out.println();
            System.out.print(e.getValue()+"");
            System.out.println();
        }
    }

}
