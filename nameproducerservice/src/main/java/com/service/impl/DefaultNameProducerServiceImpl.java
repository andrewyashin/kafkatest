package com.service.impl;

import com.service.NameProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@ConfigurationProperties
public class DefaultNameProducerServiceImpl implements NameProducerService {
    private List<String> names;
    private String topic;
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public String produceName() {
        final String name = names.get(new Random().nextInt(names.size()));
        kafkaTemplate.send(topic, name);
        return name;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Autowired
    public void setKafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
}

