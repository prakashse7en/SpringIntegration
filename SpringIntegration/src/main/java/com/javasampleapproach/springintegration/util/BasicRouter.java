package com.javasampleapproach.springintegration.util;

import org.springframework.messaging.Message;

import com.javasampleapproach.springintegration.jdbc.domain.Person;

public class BasicRouter {

	public String returnChannelName(Message<?> msg){
		Object response = msg.getPayload();
		
		if(response instanceof Person){
			Person person = (Person) response;
			if(person.getName().equalsIgnoreCase("Prakash")){
				return "routerChannelOne";
			}else{
				return "transformerTwo";
			}
		}
		return "routerChannelOne";
	}
}
