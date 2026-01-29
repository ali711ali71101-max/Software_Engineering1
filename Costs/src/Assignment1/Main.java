package Assignment1;

public class Main {

    public static void main(String[] args) {

        //سؤال 1:
        int[] original = {1,2,3,4,5};
        int[] cloned = original.clone();
        System.out.print("Cloned Array: ");
        for(int i:cloned) System.out.print(i+" ");
        System.out.println();

        //سؤال 3:
        int[] arr = {1,2,3,2,4,5};
        int elementToRemove = 2;
        int count = 0;
        for(int i:arr) if(i!=elementToRemove) count++;
        int[] newArr = new int[count];
        int j=0;
        for(int i:arr) if(i!=elementToRemove) newArr[j++]=i;
        System.out.print("Array after removing 2: ");
        for(int i:newArr) System.out.print(i+" ");
        System.out.println();

        //سؤال 5:
        class Node { int data; Node next; Node(int d){data=d;} }
        Node h1 = new Node(1); h1.next=new Node(2); h1.next.next=new Node(3);
        Node h2 = new Node(4); h2.next=new Node(5); h2.next.next=new Node(6);
        Node temp = h1;
        while(temp.next!=null) temp=temp.next;
        temp.next=h2;
        System.out.print("Concatenated Linked List: ");
        temp=h1;
        while(temp!=null){System.out.print(temp.data+" "); temp=temp.next;}
        System.out.println();

        //سؤال 7:
        Node head = new Node(10); head.next=new Node(20); head.next.next=new Node(30); head.next.next.next=new Node(40);
        temp=head; int pos=1; int found=-1;
        while(temp!=null){if(temp.data==30){found=pos;break;} temp=temp.next; pos++;}
        System.out.println("Element 30 found at position: "+found);

        //سؤال 9:
        class ques9{
            static class Node{int data;Node next; Node(int d){data=d;}}
            Node removeAtPosition(Node head,int p){
                if(head==null||p<1)return head;
                if(p==1)return head.next;
                Node t=head;
                for(int i=1;i<p-1 && t.next!=null;i++) t=t.next;
                if(t.next!=null) t.next=t.next.next;
                return head;
            }
            void printList(Node head){Node t=head; while(t!=null){System.out.print(t.data+" "); t=t.next;} System.out.println();}
        }
        ques9 q9=new ques9();
        ques9.Node hr=new ques9.Node(10);
        hr.next=new ques9.Node(20); hr.next.next=new ques9.Node(30); hr.next.next.next=new ques9.Node(40);
        hr=q9.removeAtPosition(hr,3);
        System.out.print("List after removing position 3: "); q9.printList(hr);

        //سؤال 11:
        class ques11{
            static class Node{int data; Node next, prev; Node(int d){data=d;}}
            void traverseReverse(Node head){
                if(head==null)return;
                Node t=head;
                while(t.next!=null) t=t.next;
                while(t!=null){System.out.print(t.data+" "); t=t.prev;}
                System.out.println();
            }
        }
        ques11 list11=new ques11();
        ques11.Node dh=new ques11.Node(10); ques11.Node n2=new ques11.Node(20);
        ques11.Node n3=new ques11.Node(30); ques11.Node n4=new ques11.Node(40);
        dh.next=n2; n2.prev=dh; n2.next=n3; n3.prev=n2; n3.next=n4; n4.prev=n3;
        System.out.print("Doubly Linked List in reverse: "); list11.traverseReverse(dh);

        //سؤال 13:
        class ques13{
            static class Node{int data; Node next; Node(int d){data=d;}}
            Node insertAtPosition(Node head,int d,int p){
                Node n=new Node(d);
                if(head==null){n.next=n; return n;}
                if(p==1){Node t=head; while(t.next!=head) t=t.next; n.next=head; t.next=n; return n;}
                Node t=head;
                for(int i=1;i<p-1 && t.next!=head;i++) t=t.next;
                n.next=t.next; t.next=n; return head;
            }
            void printList(Node head){
                if(head==null)return;
                Node t=head;
                do{System.out.print(t.data+" "); t=t.next;}while(t!=head);
                System.out.println();
            }
        }
        ques13 list13=new ques13();
        ques13.Node ch=new ques13.Node(10); ch.next=new ques13.Node(20); ch.next.next=new ques13.Node(30); ch.next.next.next=new ques13.Node(40); ch.next.next.next.next=ch;
        System.out.print("Original Circular List: "); list13.printList(ch);
        ch=list13.insertAtPosition(ch,25,3);
        System.out.print("After inserting 25 at position 3: "); list13.printList(ch);
        ch=list13.insertAtPosition(ch,5,1);
        System.out.print("After inserting 5 at position 1: "); list13.printList(ch);
        //سؤال 15:
        class ques15{
            static class Node{int data; Node next; Node(int d){data=d;}}
            int searchElement(Node head,int elem){
                if(head==null) return -1;
                Node t=head; int pos=1;
                do{if(t.data==elem) return pos; t=t.next; pos++;}while(t!=head);
                return -1;
            }
        }
        ques15 list15=new ques15();
        ques15.Node ch2=new ques15.Node(10); ch2.next=new ques15.Node(20); ch2.next.next=new ques15.Node(30); ch2.next.next.next=new ques15.Node(40); ch2.next.next.next.next=ch2;
        int spos=list15.searchElement(ch2,30);
        System.out.println("Element 30 found at position in Circular List: "+spos);
        spos=list15.searchElement(ch2,50);
        System.out.println("Element 50 found at position in Circular List: "+spos);
    }
}
