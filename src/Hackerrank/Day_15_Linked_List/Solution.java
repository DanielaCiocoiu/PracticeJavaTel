package Hackerrank.Day_15_Linked_List;

import java.util.Scanner;

public class Solution {
/*
            4
            2
            3
            4
            1
            out 2 3 4 1

    */

    /*The next problem is based on Data Structure “Linked List”. It is a data structure having a
    collection of elements where every element has a reference pointing to the next element in the collection.
    Each element in linked list is called a node which has commonly two parts;
    the data part and the reference part which holds the link to the other node.

            Task

    Complete the insert function in your editor so that it creates a new Node
            (pass  as the Node constructor argument) and inserts it at the tail of the linked list referenced by the  parameter.
    Once the new node is added, return the reference to the  node.*/

    public static Node insert(Node head, int data) {
        //Complete this method

        // if list has no elements, return a new node
        Node newNode = new Node(data);
        if (head == null)
            return newNode;

        // else iterate through list, add node to tail, and return head
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}