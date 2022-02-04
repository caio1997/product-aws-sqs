package com.example.send.service;

import com.example.send.publish.SendMessage;
import com.example.send.request.People;
import com.example.send.service.impl.ObjectFromSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjectFromSendServiceImpl implements ObjectFromSendService {

    @Autowired
    private SendMessage sendMessage;

    @Override
    public void send(People people) {

        sendMessage.send(people);

    }
}
