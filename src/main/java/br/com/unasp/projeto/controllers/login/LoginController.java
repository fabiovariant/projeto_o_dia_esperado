package br.com.unasp.projeto.controllers.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.controllers.JsonResponse;
import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.services.login.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/{email}/{password}",
					method = RequestMethod.GET)
	@ResponseBody
	public GroomsModel login(@PathVariable("email") String groomsEmail, @PathVariable("password") String grPassword){
		return loginService.doLogin(groomsEmail, grPassword);
	}
	
	@RequestMapping(value = "/password/{email}",
					method = RequestMethod.POST)
	@ResponseBody
	public JsonResponse forgotMyPassword(@PathVariable("email") String groomsEmail){
		loginService.forgotMyPassword(groomsEmail);
		JsonResponse jsonResponse = new JsonResponse();
		jsonResponse.setStatus(Boolean.TRUE);
		return jsonResponse;
	}
}
