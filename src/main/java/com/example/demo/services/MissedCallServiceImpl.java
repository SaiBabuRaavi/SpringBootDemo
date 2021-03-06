package com.example.demo.services;

import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MissedCallServiceImpl implements MissedCallService{

    private final CustomerRepository customerRepository;

    public MissedCallServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

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
