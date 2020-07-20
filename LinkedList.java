class Node{

    
    int data;
    Node next;
    public Node(int d){

        this.data = d;
        this.next = null;

    }


}

public class LinkedList{


    Node head;
   
    public LinkedList insertNode(LinkedList list, int data){

        Node newNode = new Node(data);
        newNode.next = null;
        
        // System.out.println(list.head);
        if(list.head == null){
            list.head = newNode;
        }else{
            Node last = list.head;
            while(last.next!=null){

                last = last.next;


            }
            last.next = newNode;

        }
        return list;

    }

    public void printList(LinkedList list){

        Node curNode = list.head;
        while(curNode != null){
            System.out.print(" " + curNode.data + " ->");
            curNode = curNode.next;
        }

    }

    public LinkedList insertAtHead(LinkedList list, int data){

        Node newNode = new Node(data);

        newNode.next = list.head;

        list.head = newNode;
        return list;

    }

    public int lengthOfList(LinkedList list){

        int length=0;
        Node curNode = list.head;

        while(curNode != null){

            length++;
            curNode = curNode.next;
        }
        return length;

    }

    public LinkedList deleteAtHead(LinkedList list){

        Node headNode = list.head;

        list.head = headNode.next;
        return list;

    }


    public boolean searchNode(LinkedList list, int data){

        Node curNode = list.head;

        while(curNode != null){
            if(curNode.data == data){
                return true;
            }
            curNode = curNode.next;
        }
        return false;

    }

    public LinkedList insertInSortedList(LinkedList list, int data){

        System.out.println("inside the insertin sorted function");

        Node node = new Node(data);
        node.next = null;

        Node curNode = list.head;

        if(curNode.data > data){

            node.next = curNode;
            list.head = node;

        }else{
            Node nextNode = curNode.next;

            while(curNode.next != null && nextNode.data < data){

                curNode = curNode.next;
                nextNode = curNode.next;

            }

            node.next = nextNode;
            curNode.next = node;

        }
        return list;
    }

    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list = new LinkedList().insertNode(list,2);
        list = new LinkedList().insertNode(list,3);
        list = new LinkedList().insertNode(list,4);
        list = new LinkedList().insertNode(list,5);


        list = new LinkedList().insertAtHead(list,1);

        list = new LinkedList().insertAtHead(list, 0);
        list = new LinkedList().insertNode(list,6);

        new LinkedList().printList(list);

        System.out.println(new LinkedList().searchNode(list,0));

        System.out.println("the length of the lisnked list is : ");
        System.out.println(new LinkedList().lengthOfList(list));

        list = new LinkedList().deleteAtHead(list);

        System.out.println(new LinkedList().searchNode(list,0));

        System.out.println("After deleting");
        new LinkedList().printList(list);

        System.out.println("the length of the lisnked list is : ");

        System.out.println(new LinkedList().lengthOfList(list));

        System.out.println("finding 2");

        System.out.println(new LinkedList().searchNode(list,2));

        System.out.println(" ");

        list = new LinkedList().insertNode(list,10);
        list = new LinkedList().insertNode(list,11);
        list = new LinkedList().insertNode(list,12);

        new LinkedList().printList(list);

        list = new LinkedList().insertInSortedList(list, 8);
        list = new LinkedList().insertInSortedList(list,13);
        list = new LinkedList().insertInSortedList(list,7);
        list = new LinkedList().insertInSortedList(list,9);
        list = new LinkedList().insertInSortedList(list,14);
        list = new LinkedList().insertInSortedList(list,15);


        new LinkedList().printList(list);



    }

}
