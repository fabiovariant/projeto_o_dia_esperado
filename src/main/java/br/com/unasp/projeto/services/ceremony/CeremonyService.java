package br.com.unasp.projeto.services.ceremony;

import br.com.unasp.projeto.models.CeremonyModel;

public interface CeremonyService {
	
	public CeremonyModel update(CeremonyModel ceremonyModel);
	
	public CeremonyModel get(Integer groomsId);
	
	public CeremonyModel save(CeremonyModel ceremonyModel);
}
