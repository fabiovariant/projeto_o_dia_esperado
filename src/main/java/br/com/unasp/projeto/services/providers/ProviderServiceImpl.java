package br.com.unasp.projeto.services.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.ProvidersModel;
import br.com.unasp.projeto.repository.providers.ProvidersDao;

@Service("providersService")
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	ProvidersDao providersDao;
	
	@Override
	public ProvidersModel update(ProvidersModel providersModel) {
		return providersDao.update(providersModel);
	}

	@Override
	public ProvidersModel get(Integer groomsId) {
		return providersDao.get(groomsId);
	}

	@Override
	public ProvidersModel save(ProvidersModel providersModel) {
		return providersDao.save(providersModel);
	}

}
