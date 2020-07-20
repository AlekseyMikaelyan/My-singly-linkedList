package org.example.collectionproject.collectionprojectutil;

import org.example.collectionsproject.collectionprojectutil.util.service.firsttask.impl.FirstTaskServiceImpl;
import org.example.collectionsproject.collectionprojectutil.util.service.firsttask.interfaces.FirstTaskService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstTaskServiceImplTest {
    List<String> list;

    @Before
    public void createListOfStrings() {
        list = new ArrayList<>();
        list.add("123dsfhsdfhdskjfdskf");
        list.add("GGGadfkjhffjwfj45");
        list.add("zdsjfhskjdf67sdkjfsdkjf");
    }

    @Test
    public void MethodShouldReturnCorrectNumber() {
        FirstTaskService firstTaskService = new FirstTaskServiceImpl();
        Assert.assertEquals(1234567, firstTaskService.collectNumber(list));
    }
}
