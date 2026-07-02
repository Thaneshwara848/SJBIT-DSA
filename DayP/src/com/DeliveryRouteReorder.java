package com;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeliveryRouteReorder {

    Node head;

    // Add customer stop
    public void addStop(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Reorder delivery route
    public void reorderRoute() {

        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node second = slow.next;
        slow.next = null;

        Node prev = null;
        Node current = second;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        second = prev;

        // Step 3: Merge first half and reversed second half
        Node first = head;

        while (second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    // Display route
    public void displayRoute() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DeliveryRouteReorder route = new DeliveryRouteReorder();

        route.addStop(1);
        route.addStop(2);
        route.addStop(3);
        route.addStop(4);
        route.addStop(5);

        System.out.println("Original Delivery Route:");
        route.displayRoute();

        route.reorderRoute();

        System.out.println("Reordered Delivery Route:");
        route.displayRoute();
    }
}