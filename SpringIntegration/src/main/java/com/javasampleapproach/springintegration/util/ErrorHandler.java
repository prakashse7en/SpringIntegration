package com.javasampleapproach.springintegration.util;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandlingException;

public class ErrorHandler {
	
	public Object error(Message<Exception> msg){
		MessageHandlingException msgNew  = null;
		try{
			msgNew = (MessageHandlingException) msg.getPayload();
			System.out.println(msgNew.getMessage());
		}catch(Exception e){
			e.printStackTrace();
		}
		return msgNew;
	}

}
