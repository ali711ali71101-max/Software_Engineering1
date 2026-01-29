package Assignment1;

public class ques7 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    public int searchElement(Node head, int element) {
        int pos = 1;
        for (Node temp = head; temp != null; temp = temp.next, pos++) {
            if (temp.data == element) return pos;
        }
        return -1;
    }
}
