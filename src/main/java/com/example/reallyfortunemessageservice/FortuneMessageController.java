package com.example.reallyfortunemessageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fortune-messages")
public class FortuneMessageController {

    @Autowired
    MessageCreator messageCreator;

    @GetMapping("/chuck")
    public FortuneMessage getChuckMessages() {
        return messageCreator.getChuckMessages();
    }

    @GetMapping("/yoda")
    public FortuneMessage getYodaMessages() {
        return messageCreator.getYodaMessages();
    }

}
