package Assignment1;

public class ques5 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node concatenate(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head2;
        return head1;
    }
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
