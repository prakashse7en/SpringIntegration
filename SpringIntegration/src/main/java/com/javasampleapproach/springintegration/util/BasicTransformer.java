package com.javasampleapproach.springintegration.util;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import com.javasampleapproach.springintegration.jdbc.domain.Gender;
import com.javasampleapproach.springintegration.jdbc.domain.Person;

public class BasicTransformer {
	
	public Message<Person> transformReq(Message<String> msg){
		Person p = new Person();
		p.setGender(Gender.FEMALE);
		p.setName("hskak");
		Message<Person> msg1 = (Message<Person>) MessageBuilder.withPayload(p).copyHeaders(msg.getHeaders()).build();
		return msg1;
	}
	
	public Message<Person> transformReqOne(Message<String> msg){
		Person p = new Person();
		p.setGender(Gender.FEMALE);
		p.setName("kohli");
		Message<Person> msg1 = (Message<Person>) MessageBuilder.withPayload(p).copyHeaders(msg.getHeaders()).build();
		return msg1;
	}

}
