package br.com.unasp.projeto.repository.party;


import br.com.unasp.projeto.models.PartyModel;

public interface PartyDao {
	
	public PartyModel get(Integer id) ;
    
    public PartyModel save(PartyModel partyModel);
    
    public PartyModel update(PartyModel partyModel);
    
}
