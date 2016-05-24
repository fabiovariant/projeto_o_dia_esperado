package br.com.unasp.projeto.repository.ceremony;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.unasp.projeto.models.CeremonyModel;

@Repository("ceremonyDao")
public class CeremonyDaoImpl implements CeremonyDao {


	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public CeremonyModel get(Integer id) {
		return entityManager.find(CeremonyModel.class, id);
	}

	@Override
	public CeremonyModel save(CeremonyModel ceremonyModel) {
		entityManager.persist(ceremonyModel);
		entityManager.flush();
		return ceremonyModel;
	}

	@Override
	@Transactional
	public CeremonyModel update(CeremonyModel ceremonyModel) {
		CeremonyModel ceremonyModelUpdate = get(ceremonyModel.getIdGrooms());
		
		if(ceremonyModelUpdate != null){
			ceremonyModelUpdate.setCivilDate(ceremonyModel.getCivilDate());
			ceremonyModelUpdate.setReligiousDate(ceremonyModel.getReligiousDate());
			ceremonyModelUpdate.setAlliance(ceremonyModel.getAlliance());
			ceremonyModelUpdate.setRegistry(ceremonyModel.getRegistry());
			ceremonyModelUpdate.setBridesmaid(ceremonyModel.getBridesmaid());
			ceremonyModelUpdate.setDocumentation(ceremonyModel.getDocumentation());
			ceremonyModelUpdate.setFatherAndChurch(ceremonyModel.getFatherAndChurch());
			ceremonyModelUpdate.setGodparents(ceremonyModel.getGodparents());
			ceremonyModelUpdate.setBridgeClothing(ceremonyModel.getBridgeClothing());
			ceremonyModelUpdate.setGroomClothing(ceremonyModel.getGroomClothing());
			ceremonyModelUpdate.setWitnesses(ceremonyModel.getWitnesses());
		}
		entityManager.flush();
		return ceremonyModelUpdate;
	}
}
