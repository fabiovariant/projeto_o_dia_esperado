package br.com.unasp.projeto.mail.impl;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.google.api.services.gmail.Gmail;

import br.com.unasp.projeto.mail.EmailSender;


//@Service("forgotEmailSender")
public class ForgotPasswordEmailSender{

	private String to;
	private String password;
	private Session session;
	private String myMail;

	public ForgotPasswordEmailSender(String to, String password) {
		this.to = to;
		this.password = password;
	}

	public void send() {
		setProperties();
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myMail));
			Address[] toUser = InternetAddress.parse(to);  
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("[O dia esperado] Senha de acesso");
			message.setText("Sua senha: " + password);
			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	protected void setProperties() {
		myMail = "fabiovariant2@gmail.com";
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(myMail, "####");
			}
		});

		/** Ativa Debug para sessão */
		session.setDebug(true);

	}

	public void send(Gmail service, String recipientEmail, String ccEmail, String fromEmail, String title,
			String message) throws IOException, MessagingException {
		// TODO Auto-generated method stub
		
	}

}
