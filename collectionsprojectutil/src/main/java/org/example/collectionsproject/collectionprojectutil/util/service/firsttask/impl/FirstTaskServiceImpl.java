package org.example.collectionsproject.collectionprojectutil.util.service.firsttask.impl;

import org.example.collectionsproject.collectionprojectutil.util.service.firsttask.interfaces.FirstTaskService;

import java.util.List;

public class FirstTaskServiceImpl implements FirstTaskService {

    @Override
    public long collectNumber(List<String> list) {

        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(s -> {
            for(int i = 0; i < s.length(); i++) {
                if(Character.isDigit(s.charAt(i))) {
                    stringBuilder.append(s.charAt(i));
                }
            }
        });

        String str = stringBuilder.toString();
        return Long.parseLong(str);
    }
}
