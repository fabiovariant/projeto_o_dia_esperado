package br.com.unasp.projeto.repository.dress;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public DressCheckModel update(DressCheckModel dressCheckModel) {
		DressCheckModel dressCheckModelUpdate = get(dressCheckModel.getIdGrooms());
		if (dressCheckModelUpdate != null){
			dressCheckModelUpdate.setDressCheck(dressCheckModel.getDressCheck());
			dressCheckModelUpdate.setIsPerfect(dressCheckModel.getIsPerfect());
			dressCheckModelUpdate.setTakeDate(dressCheckModel.getTakeDate());
			dressCheckModelUpdate.setDevolutionDate(dressCheckModel.getDevolutionDate());
		}
		return dressCheckModelUpdate;
	}
}
