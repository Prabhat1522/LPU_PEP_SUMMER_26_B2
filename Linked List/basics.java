import java.util.*;
public class basics {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
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
    public static void inserAtPosition(Node head, int pos, int data) {
        Node newNode = new Node(data);
        if(pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1&&temp!=null;i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void printLL(Node head) {
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

    public static Node head = null;
    public static void main(String[] args) {
        insertAtEnd(5);
        printLL(head);
        System.out.println();

        insertAtEnd(10);
        printLL(head);
        System.out.println();

        insertAtEnd(15);
        printLL(head);
        System.out.println();

        insertAtBegin(200);
        printLL(head);
        System.out.println();

        insertAtBegin(150);
        printLL(head);
        System.out.println();

        insertAtEnd(300);
        printLL(head);
        System.out.println();

        inserAtPosition(head, 2, 13);
        printLL(head);
        System.out.println();

        inserAtPosition(head, 3, 23);
        printLL(head);
        System.out.println();



    }
}
