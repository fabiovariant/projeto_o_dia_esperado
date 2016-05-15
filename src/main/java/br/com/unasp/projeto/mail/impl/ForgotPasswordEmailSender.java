package br.com.unasp.projeto.mail.impl;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import br.com.unasp.projeto.mail.EmailSender;
import br.com.unasp.projeto.models.GroomsModel;

public class ForgotPasswordEmailSender extends AbstractEmailSender implements EmailSender{
	private GroomsModel groomsModel;
	
	public ForgotPasswordEmailSender(GroomsModel groomsModel) {
		this.groomsModel = groomsModel;
	}


	@Override
	public void send() throws AddressException, MessagingException {
		String host = "smtp.gmail.com";
		String port = "587";
		String userName = "email";
		String password = "password";
		String subject = "[Recuperação de senha] Aqui sua senha";
		String message = "Password: " + groomsModel.getGrPassword();
		sendHtmlEmail(host, port, userName, password, groomsModel.getGroomsEmail(), subject, message);
		
	}
	
}
