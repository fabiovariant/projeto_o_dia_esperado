package br.com.unasp.projeto.repository.ceremony;

import br.com.unasp.projeto.models.CeremonyModel;

public interface CeremonyDao {

	public CeremonyModel get(Integer id) ;

	public CeremonyModel save(CeremonyModel ceremonyModel);

	public CeremonyModel update(CeremonyModel ceremonyModel);

}
