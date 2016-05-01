package br.com.unasp.projeto.services.grooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.repository.grooms.GroomsDao;

@Service(value = "groomsService")
@Transactional(propagation = Propagation.REQUIRED)
public class GroomsServiceImpl implements GroomsService{

	@Autowired
	GroomsDao groomsDao;
		
	@Override
	public GroomsModel get(Integer id){
		return groomsDao.get(id);
	}
	
	@Override
	public GroomsModel save(GroomsModel groomsModel) {
		return groomsDao.save(groomsModel);
	}
	
	@Override
	public GroomsModel update(GroomsModel groomsModel) {
		if(groomsModel.getIdGrooms() != null || groomsModel.getIdGrooms() != 0)
			return groomsDao.update(groomsModel);
		else
			return groomsModel;
	}
}
