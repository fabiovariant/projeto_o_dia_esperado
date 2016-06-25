package br.com.unasp.projeto.services.guest;

import java.util.List;

import br.com.unasp.projeto.models.GuestsListModel;

public interface GuestListService {

	public void inviteGuest(GuestsListModel guestsListModel);
	
	public void confirmGuest(String guestEmail, Integer idGrooms);

	public List<GuestsListModel> getList(Integer idGrooms);
}
