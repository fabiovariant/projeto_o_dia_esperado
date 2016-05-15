package br.com.unasp.projeto.services.ceremony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.CeremonyModel;
import br.com.unasp.projeto.repository.ceremony.CeremonyDao;

@Service("ceremonyService")
public class CeremonyServiceImpl implements CeremonyService{

	@Autowired
	CeremonyDao ceremonyDao;

	@Override
	public CeremonyModel update(CeremonyModel ceremonyModel) {
		return ceremonyDao.update(ceremonyModel);
	}

	@Override
	public CeremonyModel get(Integer groomsId) {
		return ceremonyDao.get(groomsId);
	}

	@Override
	public CeremonyModel save(CeremonyModel ceremonyModel) {
		return ceremonyDao.save(ceremonyModel);
	}

}
