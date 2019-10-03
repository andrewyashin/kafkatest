package com.consumer;

import java.util.List;

public interface NameConsumer {
    void consumeManName(String name);
    void consumeWomanName(String name);
    List<String> getAllConsumedNames();
    List<String> getManConsumedNames();
    List<String> getWomanConsumedNames();
}
