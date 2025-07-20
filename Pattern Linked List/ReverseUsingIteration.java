class Nodes {
    int val;
    Nodes next;

    Nodes(int x) {
        val = x;
        next = null;
    }
}

public class ReverseUsingIteration {

    public static Nodes reverse(Nodes head) {
        Nodes current = head;
        Nodes next = null;
        Nodes prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Nodes node1 = new Nodes(1);
        Nodes node2 = new Nodes(1);
        Nodes node3 = new Nodes(2);
        Nodes node4 = new Nodes(2);
        Nodes node5 = new Nodes(3);
        Nodes node6 = new Nodes(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println("Original List:");
        printList(node1);

        Nodes reversedHead = reverse(node1);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}
