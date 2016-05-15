package br.com.unasp.projeto.repository.providers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.ProvidersModel;

@Repository("providersDao")
public class ProvidersDaoImpl implements ProvidersDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public ProvidersModel get(Integer id) {
		ProvidersModel providersModel =  entityManager.find(ProvidersModel.class, id);
    	return providersModel;
	}

	@Override
	public ProvidersModel save(ProvidersModel providersModel) {
		entityManager.persist(providersModel);
		entityManager.flush();
		return providersModel;
	}

	@Override
	public ProvidersModel update(ProvidersModel providersModel) {
		return entityManager.merge(providersModel);
	}

}
