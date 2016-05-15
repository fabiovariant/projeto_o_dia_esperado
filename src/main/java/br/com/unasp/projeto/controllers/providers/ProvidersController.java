package br.com.unasp.projeto.controllers.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.models.ProvidersModel;
import br.com.unasp.projeto.services.providers.ProviderService;

@Controller
@RequestMapping(value = "/provider")
public class ProvidersController {

	
	@Autowired
	ProviderService providerService;
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.GET)
	@ResponseBody
	public ProvidersModel get(@PathVariable("id") Integer idGrooms){
		return providerService.get(idGrooms);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public ProvidersModel update(@RequestBody ProvidersModel providersModel){
		return providerService.update(providersModel);
	}
}

