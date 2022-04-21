//package by.academy.linkedlist;
//
//public class LinkedListCustom <T> {
//
//    private Node head;
//    private Node tail;
//    private int size = 0;
//
//    public void add(T value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            tail = newNode;
//            head = newNode;
//        } else {
//            tail.next = newNode;
//            newNode.prev = tail;
//            tail = newNode;
//        }
//        size++;
//    }
//
//    public void add(int index, T value) {
//        if (index < 0 || index > size - 1) {
//            System.err.println("Выход за пределы массива!");
//            return;
//        }
//        Node newNode = new Node(value);
//        if (index == 0) {
//            newNode.next=head;
//            head.prev=newNode;
//            head=newNode;
//            size++;
//            return;
//        }
//
//        if (index==size) {
//            newNode.prev=tail;
//            tail.next=newNode;
//            tail=newNode;
//            size++;
//            return;
//        }
//
//            Node next = getNode(index);
//            Node prev =next.prev;
//
//            size++;
//    }
//
//    private Node getNode(int index) {
//        if (index < 0 || index > size - 1) {
//            System.err.println("Выход за пределы массива!");
//            return null;
//        }
//        int counter = 0;
//        Node currentNode = head;
//        while (counter < index) {
//            currentNode = currentNode.next;
//            counter++;
//        }
//        return currentNode;
//    }
//
//
//    public T get(int index) {
//        Node node = getNode(index);
//        return node.value;
//    }
//
//
//    class Node<T> {
//        T value;
//        Node<T> prev;
//        Node<T> next;
//
//        public Node(T value) {
//            super();
//            this.value=value;
//        }
//    }
//}