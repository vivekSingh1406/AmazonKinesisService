# Amazon Kinesis Service

## Project Overview

This project demonstrates a real-time event-driven architecture using **Spring Boot**, **Amazon Kinesis**, **AWS Lambda**, and **Amazon S3**.

The Spring Boot application receives employee data through a REST API and publishes it to an Amazon Kinesis Data Stream. AWS Lambda is automatically triggered whenever a new record arrives in the stream. The Lambda function processes the record and stores it as a JSON file in an Amazon S3 bucket.

---

## Architecture

```text
Client
   │
   ▼
Spring Boot REST API
   │
   ▼
Amazon Kinesis Stream
   │
   ▼
AWS Lambda Trigger
   │
   ▼
Amazon S3
```

---

## Request Flow

```text
POST /employee
      │
      ▼
Spring Boot
      │
      ▼
Kinesis PutRecord()
      │
      ▼
Kinesis Stream
      │
      ▼
Lambda Trigger
      │
      ▼
Read JSON
      │
      ▼
Store File in S3
```

---

## AWS Services Used

* **Amazon Kinesis** – Real-time data streaming.
* **AWS Lambda** – Serverless event processing.
* **Amazon S3** – Stores employee JSON files.
* **IAM** – Manages secure access between AWS services.

---

## Technologies

* Java 21
* Spring Boot 3
* Maven
* AWS SDK v2
* Amazon Kinesis
* AWS Lambda
* Amazon S3

---

## API

**POST** `/employee`

### Request

```json
{
  "id": 101,
  "name": "Vivek Singh",
  "department": "IT",
  "salary": 85000
}
```

---

## Project Benefits

* Event-Driven Architecture
* Real-Time Data Processing
* Serverless Computing
* Highly Scalable
* Cost Effective
* Easy AWS Integration

---

## Future Enhancements

* CloudWatch Monitoring
* SNS Notifications
* SQS Dead Letter Queue
* Kinesis Firehose
* DynamoDB Integration
