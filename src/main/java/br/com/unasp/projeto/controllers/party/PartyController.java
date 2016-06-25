package br.com.unasp.projeto.controllers.party;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.models.PartyModel;
import br.com.unasp.projeto.services.party.PartyService;

@Controller
@RequestMapping(value = "/party")
public class PartyController {

	@Autowired()
	PartyService partyService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseBody
	public PartyModel getParty(@PathVariable(value = "id" )Integer idGrooms){
		return partyService.get(idGrooms);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public PartyModel update(@RequestBody PartyModel partyModel){
		return partyService.update(partyModel);
	}
	
}
