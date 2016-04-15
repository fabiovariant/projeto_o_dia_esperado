package br.com.unasp.projeto.services.grooms;

import java.util.List;

import br.com.unasp.projeto.models.GroomsModel;

public interface GroomsService {

    GroomsModel get(Integer id) ;
    List<GroomsModel> getAll();
    void save(GroomsModel groomsModel);
}
