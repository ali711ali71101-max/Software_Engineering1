package Assignment2;

import java.util.*;

public class QueueReverser {

    public static <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        reverseQueue(queue);
        System.out.println(queue);
    }
}
