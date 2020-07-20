package org.example.collectionsproject.collectionprojectutil.util.service.forwardlinkedlist.classes;


import org.example.collectionsproject.collectionprojectutil.util.service.forwardlinkedlist.interfaces.CustomList;

import java.util.AbstractList;
import java.util.Arrays;

public class ForwardLinkedList<E> extends AbstractList<E> implements CustomList<E> {

    private Node<E> head;
    private int size;

    @Override
    public void addFirst(E value) {
        Node<E> current = new Node<E>(value);
        Node<E> temp = head;

        head = current;
        current.setNext(temp);
        size++;
    }

    @Override
    public boolean add(E value) {
        if(head == null) {
            head = new Node<>(value);
        } else {
            Node<E> temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<>(value));
        }
        size++;
        return true;
    }

    @Override
    public void add(E value, int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Братан, ну шо ты вводишь!?");
        }

        if(index == size) {
            add(value);
        } else if(index == 0) {
            addFirst(value);
        } else {
            Node<E> current = new Node<>(value);
            Node<E> temp = head;
            if (temp != null) {
                for (int i = 0; i < index -1  && temp.getNext() != null; i++) {
                    temp = temp.getNext();
                }
                current.setNext(temp.getNext());
                temp.setNext(current);
            }
            size++;
        }
    }

    @Override
    public String toString() {
        Object [] array = new Object[size];

        int index = 0;
        Node<E> temp = head;
        while(temp != null) {
            array[index++] = temp.getValue();
            temp = temp.getNext();
        }
       return Arrays.toString(array);
    }

    @Override
    public E getFirst() {
        if(isEmpty()) {
            return null;
        } else {
            return head.getValue();
        }
    }

    @Override
    public E get(int index) {
        int currentIndex = 0;
        Node<E> temp = head;

        while(temp != null) {
            if(currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException("Братан, ну шо ты вводишь!?");
    }

    @Override
    public E getLast() {
        Node<E> temp = head;

        if(isEmpty()) {
            return null;
        } else {
            for(int i = 0; i < size -1; i++) {
                temp = temp.getNext();
            }
            return temp.getValue();
        }
    }

    @Override
    public void removeElement(int index) {
        if(index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node<E> temp = head;

        while(temp != null) {
            if(currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<E> {
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        public E getValue() {
            return value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
