package br.com.unasp.projeto.repository.providers;

import br.com.unasp.projeto.models.ProvidersModel;

public interface ProvidersDao {

	public ProvidersModel get(Integer id) ;

	public ProvidersModel save(ProvidersModel providersModel);

	public ProvidersModel update(ProvidersModel providersModel);

}
