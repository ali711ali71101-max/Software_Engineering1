package Assignment2;

import java.util.PriorityQueue;

public class MinPriorityQueue {

    private PriorityQueue<Integer> pq = new PriorityQueue<>();

    public void add(int x) {
        pq.offer(x);
    }

    public int remove() {
        return pq.poll();
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public static void main(String[] args) {
        MinPriorityQueue pq = new MinPriorityQueue();
        pq.add(5);
        pq.add(1);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
}
