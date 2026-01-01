import java.util.*;

public class BiggestMeatball {

    static class Person {
        int weight;
        int index;

        Person(int weight, int index) {
            this.weight = weight;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int N = sc.nextInt();
        System.out.print("Enter day's quantity: ");
        int D = sc.nextInt();

        Queue<Person> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter meatball weights: ");
            int w = sc.nextInt();
            queue.add(new Person(w, i));
        }

        int lastServed = -1;

        while (!queue.isEmpty()) {
            Person current = queue.poll();
            current.weight -= D;

            if (current.weight > 0) {
                queue.add(current);
            } else {
                lastServed = current.index;
            }
        }

        System.out.println(lastServed);
        sc.close();
    }
}
