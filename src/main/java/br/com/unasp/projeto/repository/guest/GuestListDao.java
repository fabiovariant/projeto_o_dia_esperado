package br.com.unasp.projeto.repository.guest;

import java.util.List;

import br.com.unasp.projeto.models.GuestsListModel;

public interface GuestListDao {

	public GuestsListModel get(Integer id) ;

	public GuestsListModel save(GuestsListModel guestsListModel);

	public GuestsListModel update(GuestsListModel guestsListModel);
	
	public void confirmGuest(String invitedEmail, Integer idGrooms);

	public List<GuestsListModel> getList(Integer idGrooms);

}
