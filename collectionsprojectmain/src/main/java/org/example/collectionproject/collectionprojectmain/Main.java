package org.example.collectionproject.collectionprojectmain;

import org.example.collectionsproject.collectionprojectutil.util.service.firsttask.impl.FirstTaskServiceImpl;
import org.example.collectionsproject.collectionprojectutil.util.service.firsttask.interfaces.FirstTaskService;
import org.example.collectionsproject.collectionprojectutil.util.service.forwardlinkedlist.classes.ForwardLinkedList;
import org.example.collectionsproject.collectionprojectutil.util.service.forwardlinkedlist.interfaces.CustomList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("1 Привет!");
        stringList.add("Здорова 23, братан!");
        stringList.add("Как поживаешь45?");
        stringList.add("Все67хоро1056шо, а ты как?");
        stringList.add("89 и я порядок.");

        FirstTaskService firstTask = new FirstTaskServiceImpl();
        System.out.println(firstTask.collectNumber(stringList));


        System.out.println();
        System.out.println("=============");
        System.out.println();


        CustomList<Integer> list = new ForwardLinkedList<>();
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

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(5));
        list.removeElement(5);
        System.out.println(list.size());
        System.out.println(list.get(5));
    }
}
