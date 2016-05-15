package br.com.unasp.projeto.services.guest;

import br.com.unasp.projeto.models.GuestsListModel;

public interface GuestListService {

	public void inviteGuest(GuestsListModel guestsListModel);
	
	public void confirmGuest(String guestEmail);
}
