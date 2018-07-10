package com.javasampleapproach.springintegration.mail;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.messaging.Message;

/*
 * @author Singaram Subramanian
 * 
 * MailTransformer constructs a simple mail message out of the payload (XML data in this case) 
 * that the incoming Message instance carries with it. 
 */
public class MailTransformer {
	private String mailTo;
	private String mailFrom;
	private String mailSubject;

	private static Logger logger = Logger.getLogger(MailTransformer.class);
	
	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getMailSubject() {
		return mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public MailMessage transform(Message<?> message) {
		Object payload = message.getPayload();
		String mailText = (payload != null) ? payload.toString()
				: "File is empty";
		
		logger.info("XML payload data from the file: " + mailText);
		
		MailMessage msg = new SimpleMailMessage();

		msg.setTo(mailTo);
		msg.setFrom(mailFrom);
		msg.setSubject(mailSubject);
		msg.setSentDate(new Date());
		msg.setText(mailText);
		
		logger.info("Constructed the mail to be sent to the mailbox");
		
		return msg;
	}

}