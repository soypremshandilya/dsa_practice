import java.util.*;

public class ElementFrequencyAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : A) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int repeated = 0;
        int nonRepeated = 0;

        for (int count : freq.values()) {
            if (count > 1)
                repeated++;
            else
                nonRepeated++;
        }

        System.out.println("The number of repeated values: "+repeated + ", The number of Non Repeated values:  " + nonRepeated);
    }
}
