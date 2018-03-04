package com.fiamedknuff;

public class Node<T> {
    private T info;
    private Node<T> next;

    public Node(T info) {
        this.info = info;
        this.next = null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}
