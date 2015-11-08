package com.zhuravlev.HomeWork3.linkedList;

public class NodeTest {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.add(new Node(4));
        head.add(new Node(5));


        head.print(head);
        head.removeLast();
        head.print(head);
        head.removeLast();
        head.print(head);
        head.removeLast();
    }

}
