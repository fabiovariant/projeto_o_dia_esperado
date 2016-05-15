package br.com.unasp.projeto.controllers.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unasp.projeto.controllers.JsonResponse;
import br.com.unasp.projeto.models.GuestsListModel;
import br.com.unasp.projeto.services.guest.GuestListService;

@Controller
@RequestMapping(value = "/guest")
public class GuestListController {

	@Autowired
	GuestListService guestListService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public JsonResponse inviteGuest(@RequestBody GuestsListModel guestsListModel){
		guestListService.inviteGuest(guestsListModel);
		
		JsonResponse response = new JsonResponse();
		response.setStatus(Boolean.TRUE);
		return response;
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public JsonResponse confirmGuest(@PathVariable String guestEmail){
		guestListService.confirmGuest(guestEmail);

		JsonResponse response = new JsonResponse();
		response.setStatus(Boolean.TRUE);
		return response;
	}

}
