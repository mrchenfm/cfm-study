package com.cfm.study.cache.kafka;

import kafka.consumer.ConsumerConnector;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @version v1.0
 * @ProjectName: cfm-study
 * @ClassName: KafkaConsumer
 * @Description: kafka消费者
 * @Author: fangming_chen
 * @Date: 2021/03/14 15:21
 */
@Component
@Slf4j
public class KafkaConsumerListener{

	/**
	 * 	topicPartitions ={@TopicPartition(topic = "topic1", partitions = { "0", "1" })}
	 */
	@KafkaListener(topics = "test", groupId = "consumer-group")
	public void listen(ConsumerRecord consumerRecord) {
		log.info("本次批量拉取的消息:" + consumerRecord.serializedValueSize() + " 开始消费....");
		Object value = consumerRecord.value();
		log.info("消费结束");
	}



}
