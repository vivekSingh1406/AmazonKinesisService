# KinesisService
Kinesis -> Lambda -> S3

### Flow

POST API

↓

Spring Boot

↓

Kinesis PutRecord()

↓

Kinesis Stream

↓

Lambda Trigger

↓

Lambda Reads JSON

↓

PutObject()

↓

S3
