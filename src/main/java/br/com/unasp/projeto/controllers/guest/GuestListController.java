package br.com.unasp.projeto.controllers.guest;

import java.util.List;

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

@RequestMapping(value = "/guest")
@Controller
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

	@RequestMapping(value = "/confirm/{email}/{idGrooms}", 
			        method = RequestMethod.GET)
	@ResponseBody
	public JsonResponse confirmGuest(@PathVariable(value = "email") String guestEmail, @PathVariable(value = "idGrooms") Integer idGrooms){
		guestListService.confirmGuest(guestEmail, idGrooms);

		JsonResponse response = new JsonResponse();
		response.setStatus(Boolean.TRUE);
		return response;
	}

	@RequestMapping(value="/{id}", 
					method = RequestMethod.GET)
	@ResponseBody
	public List<GuestsListModel> get(@PathVariable(value= "id") Integer idGrooms){
		return guestListService.getList(idGrooms);
	}
}
