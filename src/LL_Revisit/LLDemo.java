package LL_Revisit;

public class LLDemo {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Print Linked List
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at Start
    static Node addStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Insert at End
    static Node addEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Insert at Middle (Position-based, 0-index)
    static Node addMiddle(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return head;

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Delete at Start
    static Node deleteStart(Node head) {
        if (head == null) return null;
        return head.next;
    }

    // Delete at End
    static Node deleteEnd(Node head) {
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    // Delete at Middle (Position-based)
    static Node deleteMiddle(Node head, int position) {
        if (head == null) return null;

        if (position == 0) return head.next;

        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    // Update Node Value
    static void updateValue(Node head, int position, int newValue) {
        Node temp = head;

        for (int i = 0; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            temp.data = newValue;
        } else {
            System.out.println("Position out of range");
        }
    }

    // Reverse Linked List
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Main Method
    public static void main(String[] args) {

        // Initial Linked List: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Initial List:");
        printList(head);

        // Insert at Start
        head = addStart(head, 5);
        System.out.println("After Insert at Start:");
        printList(head);

        // Insert at End
        head = addEnd(head, 50);
        System.out.println("After Insert at End:");
        printList(head);

        // Insert at Middle
        head = addMiddle(head, 25, 2);
        System.out.println("After Insert at Position 2:");
        printList(head);

        // Delete at Start
        head = deleteStart(head);
        System.out.println("After Delete at Start:");
        printList(head);

        // Delete at End
        head = deleteEnd(head);
        System.out.println("After Delete at End:");
        printList(head);

        // Delete at Middle
        head = deleteMiddle(head, 2);
        System.out.println("After Delete at Position 2:");
        printList(head);

        // Update Value
        updateValue(head, 1, 99);
        System.out.println("After Updating Position 1 to 99:");
        printList(head);

        // Reverse List
        head = reverse(head);
        System.out.println("After Reversing:");
        printList(head);
    }
}