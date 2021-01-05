package org.kodluyoruz;

public class Queue<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    public boolean isEmpty() {
        return firstNode == null;
    }


    public void add(T value) {
        Node<T> priorLastNode = lastNode;
        lastNode = new Node<T>(value);
        lastNode.setNextNode(null);

        if (isEmpty()) {
            firstNode = lastNode;
        } else {
            priorLastNode.setNextNode(lastNode);
        }
    }

    public T poll() {

        if (isEmpty()) {
            throw new NullPointerException("You can't do this, because queue is empty.");
        }

        T dataWeWant = firstNode.getData();
        firstNode = firstNode.getNextNode();

        if (isEmpty()) {
            lastNode = null;
        }

        return dataWeWant;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return firstNode.getData();
        }
    }
}

