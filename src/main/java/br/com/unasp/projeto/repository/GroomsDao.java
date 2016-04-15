package br.com.unasp.projeto.repository;

import java.util.List;

import br.com.unasp.projeto.models.GroomsModel;

public interface GroomsDao {
	
    GroomsModel get(Integer id) ;
    List<GroomsModel> getAll();
    void save(GroomsModel groomsModel);
}
