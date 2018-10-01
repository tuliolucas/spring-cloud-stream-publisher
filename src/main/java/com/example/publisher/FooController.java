package com.example.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @Autowired
    TopicSource topicSource;

    @RequestMapping("/order")
    @ResponseBody
    public String orderFood(@RequestBody FooOrderDTO fooOrderDTO){
        topicSource.topicChannel().send(MessageBuilder.withPayload(fooOrderDTO).build());
        System.out.println(fooOrderDTO.toString());
        return "foo was sent successfully!";
    }
}