package br.com.unasp.projeto.mail;

public interface EmailSender {
	
	public void send(String toEmail);
	public void setProperties();
}
