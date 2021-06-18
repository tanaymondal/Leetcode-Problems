package com.example.programtest.linked_list;

public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);
        Node data = reverse(head);
        printList(data);

    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }




    static Node reverse(Node head) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        // 5 -> 4 -> 3 -> 2 -> 1 -> null

        Node next = null;
        Node current = head;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        return head;

    }


}
