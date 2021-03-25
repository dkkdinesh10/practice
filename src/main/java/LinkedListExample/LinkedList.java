package LinkedListExample;

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        llist.head.next=second;
        second.next=third;
        llist.printList();
    }

    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        Node nodeNew=new Node(data);
        nodeNew.next=null;
        if(list.head==null){
            list.head=nodeNew;
        }else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=nodeNew;
        }
        return list;
    }
}
