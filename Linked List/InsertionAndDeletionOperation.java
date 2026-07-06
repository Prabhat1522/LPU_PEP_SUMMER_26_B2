import java.util.*;
public class InsertionAndDeletionOperation {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void insertAtPosition(int pos, int data) {
        Node newNode = new Node(data);
        if(pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp != null;i++) {
            temp = temp.next;
        }
        if(temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteAtEnd() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public static void deleteAtBegin() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    public static void deleteAtPosition(int pos) {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        if(pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1&&temp.next!=null;i++) {
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Invalid Position");
            return;
        }
        temp.next = temp.next.next;
    }
    public static void printLL() {
        Node temp = head;
        while(temp!=null){
            if(temp.next==null ){
                System.out.print(temp.data);
            }
            else {
                System.out.print(temp.data+"->");
            }
            temp = temp.next;
        }
    }

    
    public static void main(String[] args) {
        insertAtEnd(5);
        insertAtEnd(10);
        insertAtEnd(15);

        System.out.println("Original List");
        printLL();

        System.out.println("\n\nInsert At Beginning");
        insertAtBegin(200);
        printLL();

        System.out.println("\n\nInsert At End");
        insertAtEnd(300);
        printLL();

        System.out.println("\n\nInsert At Position (3)");
        insertAtPosition(3, 100);
        printLL();

        System.out.println("\n\nDelete At Beginning");
        deleteAtBegin();
        printLL();

        System.out.println("\n\nDelete At End");
        deleteAtEnd();
        printLL();

        System.out.println("\n\nDelete At Position (3)");
        deleteAtPosition(3);
        printLL();

    }
}
