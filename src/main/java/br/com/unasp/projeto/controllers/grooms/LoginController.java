package br.com.unasp.projeto.controllers.grooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.services.grooms.GroomsService;
import br.com.unasp.projeto.services.login.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	GroomsService groomsService;
	
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/{email}/{password}",
					method = RequestMethod.GET)
	@ResponseBody
	public GroomsModel login(@PathVariable("email") String groomsEmail, @PathVariable("password") String grPassword){
		return loginService.doLogin(groomsEmail, grPassword);
	}
	
	public GroomsModel forgotMyPassword(String groomsEmail){
		return null;
	}
}
