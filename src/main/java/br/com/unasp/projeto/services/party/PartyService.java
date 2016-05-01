/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unasp.projeto.services.party;

import java.sql.SQLException;

import br.com.unasp.projeto.models.PartyModel;

public interface PartyService {

	public void save(PartyModel partyModel) throws ClassNotFoundException, SQLException;
	
	public PartyModel get(Integer groomsId);
}
