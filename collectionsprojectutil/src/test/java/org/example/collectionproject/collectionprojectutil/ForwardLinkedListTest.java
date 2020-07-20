package org.example.collectionproject.collectionprojectutil;

import org.example.collectionsproject.collectionprojectutil.util.service.forwardlinkedlist.classes.ForwardLinkedList;
import org.example.collectionsproject.collectionprojectutil.util.service.forwardlinkedlist.interfaces.CustomList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ForwardLinkedListTest {

    private CustomList<Integer> list;
    @Before
    public void createNewForwardLinkedList() {
        list = new ForwardLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
    }

    @Test
    public void MethodShouldReturnCorrectSize() {
        Assert.assertEquals(10, list.size());
    }

    @Test
    public void MethodShouldAddElementOnAFirstPosition() {
        list.addFirst(11);
        Assert.assertEquals(11, (int) list.getFirst());
    }

    @Test
    public void MethodShouldReturnCorrectElement() {
        Assert.assertEquals(10, (int) list.getLast());
    }

    @Test
    public void MethodShouldRemoveCorrectElement() {
        list.removeElement(2);
        Assert.assertEquals(4,  (int) list.get(2));
    }

    @Test
    public void MethodShouldAddElementAtCorrectPosition() {
        list.add(15, 6);
        Assert.assertEquals(15, (int) list.get(6));
    }

    @Test
    public void MethodShouldReturnTrue() {
        Assert.assertTrue(list.add(11));
    }

    @Test
    public void MethodShouldReturnFalse() {
        Assert.assertFalse(list.isEmpty());
    }

}
