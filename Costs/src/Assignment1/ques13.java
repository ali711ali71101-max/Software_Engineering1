package Assignment1;

public class ques13 {

    public static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    public Node insertAtPosition(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) { newNode.next = newNode; return newNode; }
        if (pos == 1) {
            Node temp = head; while (temp.next != head) temp = temp.next;
            newNode.next = head; temp.next = newNode; return newNode;
        }
        Node temp = head;
        for (int i = 1; i < pos-1 && temp.next != head; i++) temp = temp.next;
        newNode.next = temp.next; temp.next = newNode;
        return head;
    }
    public void printList(Node head) {
        if (head == null) return;
        Node temp = head;
        do { System.out.print(temp.data + " "); temp = temp.next; } while (temp != head);
        System.out.println();
    }
}
