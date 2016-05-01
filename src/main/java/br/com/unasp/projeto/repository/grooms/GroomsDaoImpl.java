package br.com.unasp.projeto.repository.grooms;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

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
	
	@Override
	public GroomsModel save(GroomsModel groomsModel){
		entityManager.persist(groomsModel);
		entityManager.flush();
		return groomsModel;
	}

	@Override
	public GroomsModel update(GroomsModel groomsModel) {
		return entityManager.merge(groomsModel);
	}

}
