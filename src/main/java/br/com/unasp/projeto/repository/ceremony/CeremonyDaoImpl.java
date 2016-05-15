package br.com.unasp.projeto.repository.ceremony;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.CeremonyModel;

@Repository("ceremonyDao")
public class CeremonyDaoImpl implements CeremonyDao {


	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public CeremonyModel get(Integer id) {
		CeremonyModel ceremonyModel =  entityManager.find(CeremonyModel.class, id);
    	return ceremonyModel;
	}

	@Override
	public CeremonyModel save(CeremonyModel ceremonyModel) {
		entityManager.persist(ceremonyModel);
		entityManager.flush();
		return ceremonyModel;
	}

	@Override
	public CeremonyModel update(CeremonyModel ceremonyModel) {
		return entityManager.merge(ceremonyModel);
	}
}
