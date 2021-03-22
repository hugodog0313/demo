package com.example.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

  @Autowired KafkaTemplate kafkaTemplate;

  String kafkaTopic = "kafka";

  public void send(String message) {
    kafkaTemplate.send(kafkaTopic, message);
  }
}
