package br.com.unasp.projeto.controllers.grooms;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public PartyModel getParty(Integer groomsId){
		return partyService.get(groomsId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public void save(@ModelAttribute PartyModel partyModel) throws ClassNotFoundException, SQLException{
		partyService.save(partyModel);
	}
	
}
