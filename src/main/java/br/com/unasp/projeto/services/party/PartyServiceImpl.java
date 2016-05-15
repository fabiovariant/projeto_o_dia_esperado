package br.com.unasp.projeto.services.party;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.PartyModel;
import br.com.unasp.projeto.repository.party.PartyDao;

@Service("partyService")
public class PartyServiceImpl implements PartyService{
	
	@Autowired
	PartyDao partyDao;
	
	@Override
	public PartyModel get(Integer groomsId) {
		return partyDao.get(groomsId);
	}

	@Override
	public PartyModel update(PartyModel partyModel) {
		return partyDao.update(partyModel);
	}

	@Override
	public PartyModel save(PartyModel partyModel) {
		return partyDao.save(partyModel);
	}
}
