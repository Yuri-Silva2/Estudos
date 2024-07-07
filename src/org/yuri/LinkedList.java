package org.yuri;

import java.util.Objects;

public class LinkedList {

    /**
     * LinkedList class.
     */
    static class List {

        private Node head;

        /**
         * Remove a Node at position of the list.
         *
         * @param position Position.
         */
        public void remove(int position) {
            Node temp = head; // Create a temporary node pointing to the head of the linked list
            Node prev = head; // Create a previous node pointing to the head of the linked list

            for (int i = 0; i < position; i++) { // Loop through the linked list to find the node at the given position

                if (i == 0 && position == 1) { // If the node to delete is the head
                    head = head.next; // Set the next node as the new head

                } else {

                    if (i == position - 1 && temp != null) { // If the node to delete is found
                        prev.next = temp.next; // Set the next node of the previous node to be the next node of the current node

                    } else {
                        prev = temp; // Move the previous node to the current node

                        // If the previous node is null, the position was greater than the number of nodes in the list
                        if (prev == null) break;

                        temp = temp.next; // Move the temporary node to the next node
                    }
                }
            }
        }

        /**
         * Remove a Node from the specified value.
         *
         * @param value Value.
         */
        public int remove(Double value) {
            // Check if list is empty, or we
            // reach at the end of the
            // list.
            if (head == null) return -1;

            // If current node is the
            // node to be deleted
            if (Objects.equals(head.getValue(), value)) {

                // If it's start of the node head
                // node points to second node
                if (head.getNext() != null) {
                    head.setValue(head.getNext().getValue());
                    head.setNext(head.getNext().getNext());
                    return 1;
                } else return 0;
            }

            if (remove(value) == 0) {
                head.setNext(null);
                return 1;
            }

            return -1;
        }

        /**
         * Inserts a new Node at front of the list.
         * This method is defined inside LinkedList class show above.
         *
         * @param value Value.
         */
        public void push(Double value) {

            /* Allocate the Node */
            Node node = new Node();

            /* Put in the data */
            node.setValue(value);

            /* Make a next of new Node as head */
            node.setNext(head);

            /* Move the head to point to new Node */
            head = node;
        }

        /**
         * Inserts a new Node after the given previous Node.
         * This method is defined inside LinkedList class show above.
         *
         * @param previous Previous Node.
         * @param value Value.
         */
        public void insertAfter(Node previous, Double value) {

            /* Check if the given Node is null */
            if (previous == null) return;

            /* Allocate the Node */
            Node node =  new Node();

            /* Put in the data */
            node.setValue(value);

            /* Make next of new Node as next of previous. */
            node.setNext(previous);

            /* Make next of previous as new Node. */
            previous.setNext(node);
        }

        /**
         * Appends a new Node at the end.
         * This method is defined inside LinkedList class show above.
         *
         * @param value Value.
         */
        public void append(Double value) {

            /* Allocate the Node. */
            Node node = new Node();

            /* Put in the data */
            node.setValue(value);

            if (head == null) {
                head = new Node();
                head.setValue(value);
                head.setNext(null);
                return;
            }

            /* 4. This new node is going to be the last node, so
            make next of it as null */
            node.setNext(null);

            /* Else traverse till the last node. */
            Node last = head;
            while (last.getNext() != null)
                last = last.getNext();

            /* Change the next of last node. */
            last.setNext(node);
        }
    }

    /**
     * Node of LinkedList class.
     */
    static class Node {

        private Double value;
        private Node next;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
