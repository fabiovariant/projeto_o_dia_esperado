package br.com.unasp.projeto.services.providers;

import br.com.unasp.projeto.models.ProvidersModel;

public interface ProviderService {

	public ProvidersModel update(ProvidersModel providersModel);
	
	public ProvidersModel get(Integer groomsId);
	
	public ProvidersModel save(ProvidersModel providersModel);
}
