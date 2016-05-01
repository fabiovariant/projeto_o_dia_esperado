package br.com.unasp.projeto.services.party;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.PartyModel;
import br.com.unasp.projeto.repository.party.PartyDao;

@Service("partyService")
public class PartyServiceImpl implements PartyService{
	
	@Autowired
	PartyDao partyDao;
	
	Connection connection;
	public void save(PartyModel partyModel) throws ClassNotFoundException, SQLException {
		
	}

	public PartyModel get(Integer groomsId) {
		return null;
	}
}
