package jonathan;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    private Node head;



    public void insertAtBeginning(int data) {
               Node newNode = new Node(data);
               if (head == null) {
                    head = newNode;
               } else {
                   newNode.next = head;
                  head = newNode;
               }
    }

           public void insertAtEnd(int data) {
               Node newNode = new Node(data);
                 if (head == null) {
                   head = newNode;
               } else {
                   Node current = head;
                   while (current.next != null) {
                        current = current.next;
                    }
                    current.next = newNode;
                }
            }

            public void insertAtPosition(int data, int position) {
                if (position == 0) {
                    insertAtBeginning(data);
                } else {
                    Node newNode = new Node(data);
                    Node current = head;
                    Node previous = null;
                    int count = 0;

                    while (current != null && count < position) {
                        previous = current;
                        current = current.next;
                        count++;
                    }

                    if (current == null && count < position) {  // If position exceeds the length of the list
                        System.out.println("Invalid position");
                        return;
                    }

                    previous.next = newNode;
                    newNode.next = current;
                }
            }
        }


