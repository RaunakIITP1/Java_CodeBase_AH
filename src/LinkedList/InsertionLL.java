package LinkedList;

public class InsertionLL {


    static class Node{
        int  data;
        Node next;


        Node(int data)
        {
            this.data= data;
            this.next= null;
        }
    }

    static void main(String[] args) {

        Node head =  new Node(10);

        Node second = new Node(20);


        Node third = new Node(30);

        head.next= second;
        second.next= third;


//        Insert at beginning

        Node newNode= new Node(5);
        newNode.next= head;
        head= newNode;

//        Insert at end

        Node endNode = new Node(50);
        Node temp = head;
        while(temp!=null){
            temp= temp.next;
        }
        temp.next= endNode;




        temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }

        System.out.print("Null");






    }
}
