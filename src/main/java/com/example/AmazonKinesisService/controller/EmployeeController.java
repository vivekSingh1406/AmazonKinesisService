package com.example.AmazonKinesisService.controller;

import com.example.AmazonKinesisService.model.Employee;
import com.example.AmazonKinesisService.service.KinesisProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private KinesisProducerService service;

    @PostMapping
    public String send(@RequestBody Employee employee) throws Exception {
        service.publish(employee);
        return "Message Sent Successfully";

    }

}