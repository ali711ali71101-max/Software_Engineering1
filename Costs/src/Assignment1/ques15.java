package Assignment1;

public class ques15 {

    public static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    public int searchElement(Node head, int element) {
        if(head == null) return -1;
        Node temp = head;
        int pos = 1;
        do {
            if(temp.data == element) return pos;
            temp = temp.next;
            pos++;
        } while(temp != head);
        return -1;
    }
    public void printList(Node head) {
        if(head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp != head);
        System.out.println();
    }
}
