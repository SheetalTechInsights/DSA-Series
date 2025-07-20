import java.util.List;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}
public class RemoveDuplicateFromLinkedList {

      public static  void Remove(ListNode head){
          ListNode currentNode = head;
          while(currentNode!=null && currentNode.next!=null) {
              if (currentNode.val == currentNode.next.val){
                  currentNode.next = currentNode.next.next;
              }
              else{
                  currentNode = currentNode.next;
              }
          }

      }
      public static void print(ListNode head){
          ListNode temp = head;
          while(temp!=null){
              System.out.print(temp.val+"->");
              temp = temp.next;
          }
          System.out.println("null");

      }
    public static void main(String[] args) {
      ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println("linked list before removing Duplicate:");
        print(node1);

        RemoveDuplicateFromLinkedList.Remove(node1);
        System.out.println("Linked list After : ");
        print(node1);


    }
}
