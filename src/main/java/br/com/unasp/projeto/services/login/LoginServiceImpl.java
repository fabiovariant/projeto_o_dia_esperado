package br.com.unasp.projeto.services.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.mail.EmailSender;
import br.com.unasp.projeto.mail.impl.ForgotPasswordEmailSender;
import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.repository.login.LoginDao;

@Service(value =  "loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	EmailSender forgotEmailSender;

	@Override
	public GroomsModel doLogin(String email, String password) {
		if((email != null && password != null) && (!email.isEmpty() && !password.isEmpty())){
			return loginDao.doLogin(email, password);
		}
		else{
			return new GroomsModel();
		}
	}

	@Override
	public void forgotMyPassword(String email) {
		GroomsModel groomsModel = loginDao.getByEmail(email);
		forgotEmailSender = new ForgotPasswordEmailSender(groomsModel);
	}

}
