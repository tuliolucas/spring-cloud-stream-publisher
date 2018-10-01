package com.example.publisher;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(TopicSource.class)
public class FooOrderPublisher {
}
