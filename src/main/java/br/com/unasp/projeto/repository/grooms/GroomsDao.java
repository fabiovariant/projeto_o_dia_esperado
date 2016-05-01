package br.com.unasp.projeto.repository.grooms;

import br.com.unasp.projeto.models.GroomsModel;

public interface GroomsDao {
	
    public GroomsModel get(Integer id) ;
    
    public GroomsModel save(GroomsModel groomsModel);
    
    public GroomsModel update(GroomsModel groomsModel);
}
