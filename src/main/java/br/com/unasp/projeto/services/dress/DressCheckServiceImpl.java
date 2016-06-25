package br.com.unasp.projeto.services.dress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.DressCheckModel;
import br.com.unasp.projeto.repository.dress.DressCheckDao;

@Service("dressCheckService")
public class DressCheckServiceImpl implements DressCheckService{

	@Autowired
	DressCheckDao dressCheckDao;

	@Override
	public DressCheckModel update(DressCheckModel dressCheckModel) {
		return dressCheckDao.update(dressCheckModel);
	}

	@Override
	public DressCheckModel get(Integer groomsId) {
		return dressCheckDao.get(groomsId);
	}

	@Override
	public DressCheckModel save(DressCheckModel dressCheckModel) {
		return dressCheckDao.save(dressCheckModel);
	}
	

}
