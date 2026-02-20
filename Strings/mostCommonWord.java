import java.util.*;
class mostCommonWord {
    public static void main(String[] args) {
        String str = "My name is Prem is Prem Prem prem";
        str = str.toLowerCase();
        
        String[] words = str.split("\\s+");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        
        
        String maxWord = "";
        int maxCount = 0;
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println(maxWord+" : "+maxCount);
    }
}