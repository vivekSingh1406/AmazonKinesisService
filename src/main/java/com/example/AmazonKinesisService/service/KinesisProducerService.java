package com.example.AmazonKinesisService.service;

import com.example.AmazonKinesisService.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.services.kinesis.KinesisClient;
import software.amazon.awssdk.services.kinesis.model.PutRecordRequest;

@Service
public class KinesisProducerService {

    @Value("${kinesis.stream-name}")
    private String streamName;

    @Autowired
    private KinesisClient client;

    private final ObjectMapper mapper = new ObjectMapper();

    public void publish(Employee employee) throws Exception {

        String json = mapper.writeValueAsString(employee);

        PutRecordRequest request =
                PutRecordRequest.builder()
                        .streamName(streamName)
                        .partitionKey(employee.getDepartment())
                        .data(SdkBytes.fromUtf8String(json))
                        .build();
        client.putRecord(request);

        System.out.println("Message Published Successfully");

    }

}