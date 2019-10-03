package com.service.impl;

import com.consumer.NameConsumer;
import com.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultNameService implements NameService {
    private NameConsumer nameConsumer;

    @Override
    public List<String> getAllNames() {
        return nameConsumer.getAllConsumedNames();
    }

    @Override
    public List<String> getManNames() {
        return nameConsumer.getManConsumedNames();
    }

    @Override
    public List<String> getWomanNames() {
        return nameConsumer.getWomanConsumedNames();
    }

    @Autowired
    public void setNameConsumer(NameConsumer nameConsumer) {
        this.nameConsumer = nameConsumer;
    }
}
