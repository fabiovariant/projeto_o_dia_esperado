package br.com.unasp.projeto.repository.dress;

import br.com.unasp.projeto.models.DressCheckModel;

public interface DressCheckDao {

	public DressCheckModel get(Integer id) ;

	public DressCheckModel save(DressCheckModel dressCheckModel);

	public DressCheckModel update(DressCheckModel dressCheckModel);

}
