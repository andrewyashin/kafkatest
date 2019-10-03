package com.service.impl;

import com.service.NameProducerService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableConfigurationProperties
@ConfigurationProperties
public class DefaultNameProducerServiceImpl implements NameProducerService {
    private List<String> names;

    @Override
    public String produceName() {
        return names.stream().findAny().get();
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}

