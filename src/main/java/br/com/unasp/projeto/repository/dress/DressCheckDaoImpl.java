package br.com.unasp.projeto.repository.dress;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.DressCheckModel;

@Repository("dressCheckDao")
public class DressCheckDaoImpl implements DressCheckDao {

	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public DressCheckModel get(Integer id) {
		DressCheckModel checkModel =  entityManager.find(DressCheckModel.class, id);
    	return checkModel;
	}

	@Override
	public DressCheckModel save(DressCheckModel dressCheckModel) {
		entityManager.persist(dressCheckModel);
		entityManager.flush();
		return dressCheckModel;
	}

	@Override
	public DressCheckModel update(DressCheckModel dressCheckModel) {
		return entityManager.merge(dressCheckModel);
	}
}
