package br.com.unasp.projeto.repository.party;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.PartyModel;

@Repository(value = "partyDao")
public class PartyDaoImpl implements PartyDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public PartyModel get(Integer id) {
		PartyModel partyModel =  entityManager.find(PartyModel.class, id);
    	
    	return partyModel;
	}

	@Override
	public PartyModel save(PartyModel partyModel) {
		entityManager.persist(partyModel);
		entityManager.flush();
		return partyModel;
	}

	@Override
	public PartyModel update(PartyModel partyModel) {
		return entityManager.merge(partyModel);
	}
}
