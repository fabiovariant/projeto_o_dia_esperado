package br.com.unasp.projeto.mail.impl;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import br.com.unasp.projeto.mail.EmailSender;
import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.models.GuestsListModel;

public class GuestListEmailSender extends AbstractEmailSender implements EmailSender{

	private GroomsModel groomsModel;
	private GuestsListModel guestsListModel;
	
	public GuestListEmailSender(GuestsListModel guestListModel, GroomsModel groomsModel) {
		this.groomsModel = groomsModel;
		this.guestsListModel = guestListModel;
	}


	@Override
	public void send() throws AddressException, MessagingException {
		String host = "smtp.gmail.com";
		String port = "587";
		String userName = "email";
		String password = "password";
		String subject = "[Convite de casamento] " + groomsModel.getNmGroom() + " & " + groomsModel.getNmBridge();
		String message = "email message";
		sendHtmlEmail(host, port, userName, password, guestsListModel.getEmailInvited(), subject, message);
		
	}
}