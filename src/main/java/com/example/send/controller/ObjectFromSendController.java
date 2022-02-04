package com.example.send.controller;

import com.example.send.request.People;
import com.example.send.service.impl.ObjectFromSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send-object")
public class ObjectFromSendController{

    @Autowired
    private ObjectFromSendService objectFromSendService;

    @PostMapping
    public ResponseEntity<String> sendObject(@RequestBody People people) {
        try {
            System.out.println(people);
            objectFromSendService.send(people);
            return ResponseEntity.ok().body("OKAY");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
