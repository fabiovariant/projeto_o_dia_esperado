package br.com.unasp.projeto.services.login;

import br.com.unasp.projeto.models.GroomsModel;

public interface LoginService {
	
	public GroomsModel doLogin(String email, String password);
	public void forgotMyPassword(String email);

}
