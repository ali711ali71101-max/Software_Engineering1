package Assignment2;

import java.util.*;

public class QueueMerger {

    public static Queue<Integer> mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek())
                result.offer(q1.poll());
            else
                result.offer(q2.poll());
        }

        while (!q1.isEmpty()) result.offer(q1.poll());
        while (!q2.isEmpty()) result.offer(q2.poll());

        return result;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(2, 4, 6));

        System.out.println(mergeSortedQueues(q1, q2));
    }
}
