package com.example.publisher;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TopicSource {

    @Output("TopicChannel")
    MessageChannel topicChannel();

}
