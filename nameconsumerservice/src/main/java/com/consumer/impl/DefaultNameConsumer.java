package com.consumer.impl;

import com.consumer.NameConsumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class DefaultNameConsumer implements NameConsumer {
    private List<String> manNames = new ArrayList<>();
    private List<String> womanNames = new ArrayList<>();

    @Override
    @KafkaListener(topics = "man-name")
    public void consumeManName(String name) {
        manNames.add(name);
    }

    @Override
    @KafkaListener(topics = "woman-name")
    public void consumeWomanName(String name) {
        womanNames.add(name);
    }

    @Override
    public List<String> getManConsumedNames() {
        return Collections.unmodifiableList(manNames);
    }

    @Override
    public List<String> getWomanConsumedNames() {
        return Collections.unmodifiableList(womanNames);
    }

    @Override
    public List<String> getAllConsumedNames() {
        final ArrayList<String> resultNames = new ArrayList<>(manNames);
        resultNames.addAll(womanNames);
        return Collections.unmodifiableList(womanNames);
    }
}
