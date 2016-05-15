package br.com.unasp.projeto.services.grooms;

import br.com.unasp.projeto.models.GroomsModel;

public interface GroomsService {

    public GroomsModel get(Integer id);
    public GroomsModel saveOrUpdate(GroomsModel groomsModel);
}
