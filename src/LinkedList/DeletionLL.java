package LinkedList;

public class DeletionLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void main(String[] args) {

        Node  head = null;

        Node n1= new Node(5);
        n1.next= head;
        head= n1;

        Node n2= new Node(10);
        n2.next= head;
        head= n2;

        Node n3= new Node(30);

//        delete from start
        head.next= n3;


//        Delete from end

        Node temp = head;
        while (temp.next.next!=null){
            temp= temp.next;
        }
        temp.next= null;


        temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");



    }
}
