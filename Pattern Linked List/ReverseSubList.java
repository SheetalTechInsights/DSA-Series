class Nods{
    int val;
    Nods next;

    Nods(int x){
        val = x;
        next = null;
    }

}
public class ReverseSubList {

    public  Nods reverse(Nods head ,int left,int right){
        if(head==null || left== right)return head;
        Nods dummyNode  = new Nods(0);  //1.to handle elge cases
        dummyNode.next = head;
        Nods prev = dummyNode;

        //2. to take previous one node before left

        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }

        //3.to reverse sub list

        Nods current  = prev.next;
        Nods next = null;
        Nods prevSubList = null;

        //4.apply loop to reverse sub list
        for(int i =0;i<(right-left+1);i++){
            next = current.next;
            current.next  = prevSubList;
            prevSubList  = current;
            current = next;


        }
        prev.next.next = current;  // Reversed sublist ka last node aage jode
        prev.next = prevSubList;

        return  dummyNode.next;
    }
    // Function to print the linked list
    public static void printList(Nods head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Nods node1 = new Nods(1);
        Nods node2 = new Nods(2);
        Nods node3 = new Nods(3);
        Nods node4 = new Nods(4);
        Nods node5 = new Nods(5);
        Nods node6 = new Nods(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ReverseSubList obj = new ReverseSubList();
        int left = 2, right = 5; // Reverse from position 2 to 5

        node1 = obj.reverse(node1, left, right);

        System.out.println("List after reversing from position " + left + " to " + right + ":");
        printList(node1);

    }
}
