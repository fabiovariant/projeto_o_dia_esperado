package br.com.unasp.projeto.repository.login;

import br.com.unasp.projeto.models.GroomsModel;

public interface LoginDao {

	public GroomsModel doLogin(String email, String password);

	GroomsModel getByEmail(String email);
}
