import DoubleNode.DoubleLinkedNode;

public class DoublyLinkedList{

    DoubleLinkedNode head;
    

    public static DoublyLinkedList insertAtHead(DoublyLinkedList list, int data){

        DoubleLinkedNode newNode = new DoubleLinkedNode(data);
        DoubleLinkedNode nextNode;
        DoubleLinkedNode temp;
        newNode.prev = null;

        if(list.head == null){
            list.head = newNode;
        }else{

            newNode.next = list.head;
            list.head.prev = newNode;
            list.head = newNode;

        }

        return list;
    }


    public static DoublyLinkedList insertAtEnd(DoublyLinkedList list, int data){

        DoubleLinkedNode newNode = new DoubleLinkedNode(data);
        DoubleLinkedNode curNode = list.head;
        while(curNode.next != null){
            curNode = curNode.next;
        }

        curNode.next = newNode;
        newNode.prev = curNode;


        return list;

    }


    public static DoublyLinkedList insertSortedNode(DoublyLinkedList list, int data){

        DoubleLinkedNode newNode = new DoubleLinkedNode(data);

        DoubleLinkedNode curNode = list.head;

        if(list.head == null){

            list.head = newNode;
            newNode.next = null;

        }else if(list.head.data >= data){

            newNode.next = list.head;
            newNode.next.prev = newNode;
            list.head = newNode;


        }else {

            while(curNode.next != null && curNode.data <= data){

                curNode = curNode.next;
    
            }
    
            if(curNode.next == null){
    
                curNode.next = newNode;
                newNode.prev = curNode;
    
            }else if(curNode == list.head){
    
                newNode.next = list.head;
                list.head.prev = newNode;
                list.head = newNode;
    
            }else{
    
                newNode.next = curNode;
                newNode.prev = curNode.prev;
                curNode.prev.next = newNode;
                curNode.prev = newNode;
    
            }
           

        }
       

        return list;
    }

    public static void printList(DoublyLinkedList list){

        DoubleLinkedNode curNode = list.head;

        while(curNode != null){

            System.out.print(curNode.data + " => ");
            curNode = curNode.next;

        }

        System.out.println();
        

    }


    public static void printInverseList(DoublyLinkedList list){

        DoubleLinkedNode lastNode = list.head;
        
        while(lastNode.next != null){

            lastNode = lastNode.next;

        }

        System.out.println("last node is " + lastNode.data);
        DoubleLinkedNode curNode = lastNode;
        while(curNode != null){

            System.out.print(curNode.data + " => ");
            curNode = curNode.prev;

        }

    }




    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();



        list =  DoublyLinkedList.insertAtHead(list ,4);
        list =  DoublyLinkedList.insertAtHead(list ,3);

        list =  DoublyLinkedList.insertAtHead(list ,2);
        list =  DoublyLinkedList.insertSortedNode(list ,1);


        DoublyLinkedList.printList(list);

        DoublyLinkedList.printInverseList(list);

        list =  DoublyLinkedList.insertAtEnd(list ,5);


        list =  DoublyLinkedList.insertAtEnd(list ,7);

        list =  DoublyLinkedList.insertAtEnd(list ,8);

        list =  DoublyLinkedList.insertSortedNode(list ,9);
        list =  DoublyLinkedList.insertSortedNode(list ,6);
        list =  DoublyLinkedList.insertSortedNode(list ,1);
        list =  DoublyLinkedList.insertSortedNode(list ,1);


        System.out.println("Printing the list after inserting at the end");

        DoublyLinkedList.printList(list);

        DoublyLinkedList.printInverseList(list);
    }
}