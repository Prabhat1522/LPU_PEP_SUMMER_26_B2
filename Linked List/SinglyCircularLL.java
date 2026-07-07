import java.util.*;
public class SinglyCircularLL {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;

    public static void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public static void printLL() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp != head);
        System.out.println();
    }
    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            head.next = head;
        }
        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    public static void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }
    public static void insertAtPosition(int data, int pos) {
        if(pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }
        if(pos == 1) {
            insertAtBegin(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void deleteAtBegin() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        if(head.next == head) { 
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;   
    }
    public static void deleteAtEnd() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }
    public static void deleteAtPosition(int pos) {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        if(pos < 0) {
            System.out.println("Invalid Position");
            return;
        }
        if(pos == 1) {
            deleteAtBegin();
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1&&temp.next.next!=head;i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        System.out.println("\nOriginal Circular Linked List:");
        printLL();

        // Insert at Beginning
        System.out.println("\nAfter Insert At Beginning (5):");
        insertAtBegin(5);
        printLL();

        // Insert at End
        System.out.println("\nAfter Insert At End (100):");
        insertAtEnd(100);
        printLL();

        // Insert at Position
        System.out.println("\nAfter Insert 50 at Position 3:");
        insertAtPosition(50, 3);
        printLL();

        // Delete at Beginning
        System.out.println("\nAfter Delete At Beginning:");
        deleteAtBegin();
        printLL();

        // Delete at End
        System.out.println("\nAfter Delete At End:");
        deleteAtEnd();
        printLL();

        // Delete at Position
        System.out.println("\nAfter Delete At Position 3:");
        deleteAtPosition(3);
        printLL();

        sc.close();


    }
    
}
