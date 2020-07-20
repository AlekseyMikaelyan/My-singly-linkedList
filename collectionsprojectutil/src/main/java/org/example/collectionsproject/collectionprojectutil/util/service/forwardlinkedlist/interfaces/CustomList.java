package org.example.collectionsproject.collectionprojectutil.util.service.forwardlinkedlist.interfaces;

public interface CustomList<E> {
    int size();
    void addFirst(E value);
    boolean add(E value);
    void add(E value, int index);
    E get(int index);
    void removeElement(int index);
    boolean isEmpty();
    E getFirst();
    E getLast();

}
