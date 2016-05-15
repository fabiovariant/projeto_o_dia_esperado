package br.com.unasp.projeto.controllers.invitation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.models.InvitationModel;
import br.com.unasp.projeto.services.invitation.InvitationService;

@Controller
@RequestMapping(value = "/invitation")
public class InvitationController {
	
	@Autowired
	InvitationService invitationService;
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.GET)
	@ResponseBody
	public InvitationModel get(@PathVariable("id") Integer groomsId){
		return invitationService.get(groomsId);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public InvitationModel update(@RequestBody InvitationModel invitationModel){
		return invitationService.update(invitationModel);
	}

}
