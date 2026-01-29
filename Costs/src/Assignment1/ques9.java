package Assignment1;

public class ques9 {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public Node removeAtPosition(Node head, int pos) {
        if (head == null || pos < 1) return head;
        if (pos == 1) return head.next;

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;

        if (temp.next != null) temp.next = temp.next.next;

        return head;
    }
    public void printList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
        System.out.println();
    }
}
