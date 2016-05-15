package br.com.unasp.projeto.controllers.ceremony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.models.CeremonyModel;
import br.com.unasp.projeto.services.ceremony.CeremonyService;

@Controller
@RequestMapping(value = "/ceremony")
public class CeremonyController {
	
	@Autowired
	CeremonyService ceremonyService;
	
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.GET)
	@ResponseBody
	public CeremonyModel get(@PathVariable(value = "id")Integer idGrooms){
		return ceremonyService.get(idGrooms);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public CeremonyModel update(@RequestBody CeremonyModel ceremonyModel){
		return ceremonyService.update(ceremonyModel);
	}

}
