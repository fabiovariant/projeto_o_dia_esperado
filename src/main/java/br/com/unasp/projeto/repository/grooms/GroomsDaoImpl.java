package br.com.unasp.projeto.repository.grooms;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.unasp.projeto.models.GroomsModel;

@Repository(value = "groomsDao")
public class GroomsDaoImpl implements GroomsDao{

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public GroomsModel get(Integer id){
    	GroomsModel groomsModel =  entityManager.find(GroomsModel.class, id);
    	return groomsModel;
	}
	
	@Transactional
	@Override
	public GroomsModel save(GroomsModel groomsModel){
		entityManager.persist(groomsModel);
		entityManager.flush();
		return groomsModel;
	}

	@Override
	public GroomsModel update(GroomsModel groomsModel) {
		GroomsModel groomsModelUpdate = get(groomsModel.getIdGrooms());
		if(groomsModelUpdate != null){
			groomsModelUpdate.setNmGroom(groomsModel.getNmGroom());
			groomsModelUpdate.setNmBridge(groomsModel.getNmBridge());
			groomsModelUpdate.setGroomsEmail(groomsModel.getGroomsEmail());
			groomsModelUpdate.setGrPassword(groomsModel.getGrPassword());
		}
		return groomsModelUpdate;
	}
}
