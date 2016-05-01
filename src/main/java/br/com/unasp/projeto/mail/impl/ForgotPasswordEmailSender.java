package br.com.unasp.projeto.mail.impl;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.unasp.projeto.mail.EmailSender;

public class ForgotPasswordEmailSender implements EmailSender {

	String to;
	String from;
	String host;
	Properties properties;
	Session session;	
	@Override
	public void send(String toEmail) {
		try{
			MimeMessage message = new MimeMessage(session);

			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Senha da conta");
			message.setText("Here is your password: ");
			Transport.send(message);
		}catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	@Override
	@PostConstruct
	public void setProperties() {
		this.to = "abcd@gmail.com";
		this.from = "web@gmail.com";
		this.host = "localhost";
		this.properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		this.session = Session.getDefaultInstance(properties);
	}

}
