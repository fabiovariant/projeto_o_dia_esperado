package br.com.unasp.projeto.mail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface EmailSender {
	
	public void send() throws AddressException, MessagingException;

}
