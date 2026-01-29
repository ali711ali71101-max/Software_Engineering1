package Assignment1;

public class ques11 {

    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) { this.data = data; next = prev = null; }
    }
    public void traverseReverse(Node head) {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
