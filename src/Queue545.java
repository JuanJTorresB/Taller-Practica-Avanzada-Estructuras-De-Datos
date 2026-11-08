import java.util.ArrayList;
import java.util.Scanner;

public class Queue545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        ArrayList<Integer> queue = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(sc.next()));
        }

        queue.sort(null);

        System.out.println(queue);

        long waitTime = 0L;
        int happyPeople = 0;

        for (int person : queue){
            if (waitTime <= person) {
                happyPeople++;
                waitTime += person;
            }
        }

        System.out.println(happyPeople);
    }
}