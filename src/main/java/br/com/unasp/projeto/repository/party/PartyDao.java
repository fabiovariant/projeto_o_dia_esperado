package br.com.unasp.projeto.repository.party;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.unasp.projeto.models.PartyModel;

public interface PartyDao {

	public void save(Connection connection, PartyModel partyModel) throws SQLException;
	
	public PartyModel get(Connection connection, Integer groomsId) throws SQLException;
}
