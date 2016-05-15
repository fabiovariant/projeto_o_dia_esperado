/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unasp.projeto.services.party;

import br.com.unasp.projeto.models.PartyModel;

public interface PartyService {

	public PartyModel update(PartyModel partyModel);
	
	public PartyModel get(Integer groomsId);
	
	public PartyModel save(PartyModel partyModel);
}
