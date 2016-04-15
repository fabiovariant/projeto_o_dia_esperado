package br.com.unasp.projeto.services.grooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.unasp.projeto.models.GroomsModel;
import br.com.unasp.projeto.repository.GroomsDao;

@Service(value = "groomsService")
@Transactional(propagation = Propagation.REQUIRED)
public class GroomsServiceImpl implements GroomsService{

	@Autowired
	GroomsDao groomsDao;
	// private final String INSERT_INTO_TB_GROOMS_DATA = "INSERT INTO tb_grooms_data (?) VALUES (?)";
	
	public GroomsModel get(Integer id) {
		return groomsDao.get(id);
	}
	public List<GroomsModel> getAll() {
		return groomsDao.getAll();
	}
	public void save(GroomsModel groomsModel) {
		groomsDao.save(groomsModel);
		
	}
}
