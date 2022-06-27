package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MissedCallServiceImpl implements MissedCallService{

    /**
     * @return
     */
    @Override
    public List<String> findAll() {
        List<String> list=new ArrayList<>();
        list.add("870-530-2617");
        list.add("903-530-2617");
        return list;
    }
}
