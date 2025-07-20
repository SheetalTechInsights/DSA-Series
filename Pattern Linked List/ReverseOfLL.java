import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
};

public class ReverseOfLL {
    Node head;
    public void reverseUsingStack(){
      Node temp;
      temp=head;
        Stack<Node> st = new Stack<>();
       while (temp!=null){
           st.push(temp);
           temp=temp.next;
       }
       head = st.pop();
       temp=head;
       while(!st.isEmpty()){
          temp.next = st.pop();
          temp = temp.next;
       }
        temp.next = null;
    }

    public Node reverse(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseOfLL list = new ReverseOfLL();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverseUsingStack();


        System.out.println("Reversed Linked List using Stack:");
        list.printList();
    }
}