package br.com.unasp.projeto.services.dress;

import br.com.unasp.projeto.models.DressCheckModel;

public interface DressCheckService {

	public DressCheckModel update(DressCheckModel dressCheckModel);
	
	public DressCheckModel get(Integer groomsId);
	
	public DressCheckModel save(DressCheckModel dressCheckModel);

}
