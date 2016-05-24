package br.com.unasp.projeto.repository.providers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public ProvidersModel update(ProvidersModel providersModel) {
		ProvidersModel providersModelUpdate = get(providersModel.getIdGrooms());
		if(providersModelUpdate != null){
			providersModelUpdate.setProviderName(providersModel.getProviderName());
			providersModelUpdate.setArea(providersModel.getArea());
			providersModelUpdate.setIsConfirmed(providersModel.getIsConfirmed());
			providersModelUpdate.setProviderSite(providersModel.getProviderSite());
			providersModelUpdate.setPrice(providersModel.getPrice());
			providersModelUpdate.setProviderPhone(providersModel.getProviderPhone());
		}
		return providersModelUpdate;
	}

}
