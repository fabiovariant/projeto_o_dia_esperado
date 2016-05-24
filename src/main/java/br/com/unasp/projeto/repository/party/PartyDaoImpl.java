package br.com.unasp.projeto.repository.party;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public PartyModel update(PartyModel partyModel) {
		PartyModel partyModelUpdate = get(partyModel.getIdGrooms());
		if(partyModelUpdate != null){
			partyModelUpdate.setDrinks(partyModel.getDrinks());
			partyModelUpdate.setCakeCandy(partyModel.getCakeCandy());
			partyModelUpdate.setBuffet(partyModel.getBuffet());
			partyModelUpdate.setCar(partyModel.getCar());
			partyModelUpdate.setDecoration(partyModel.getDecoration());
			partyModelUpdate.setPhotoAndVideo(partyModel.getPhotoAndVideo());
			partyModelUpdate.setLocale(partyModel.getLocale());
			partyModelUpdate.setSafety(partyModel.getSafety());
			partyModelUpdate.setSound(partyModel.getSound());
			partyModelUpdate.setValet(partyModel.getValet());
		}
		return partyModelUpdate;
	}
}
