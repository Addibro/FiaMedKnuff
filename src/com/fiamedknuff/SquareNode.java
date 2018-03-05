package com.fiamedknuff;

public class SquareNode<T> {
    private T info;
    private SquareNode<T> next;
    private SquareNode<T> prev;

    public SquareNode(T info) {
        this.info = info;
        this.next = null;
        this.prev = null;
    }

    public void setNext(SquareNode<T> next) {
        this.next = next;
    }
    public void setPrev(SquareNode<T> prev) {
        this.prev = prev;
    }
    public SquareNode<T> getNext() {
        return next;
    }
    public SquareNode<T> getPrev() {
        return prev;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}
