package com.example.reallyfortunemessageservice;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageCreator {

    @Autowired
    Faker faker;

    public FortuneMessage getChuckMessages(){

        FortuneMessage message = new FortuneMessage(faker.chuckNorris().fact());
        return message;
    }

    public FortuneMessage getYodaMessages(){

        FortuneMessage message = new FortuneMessage(faker.yoda().quote());
        return message;
    }
}
