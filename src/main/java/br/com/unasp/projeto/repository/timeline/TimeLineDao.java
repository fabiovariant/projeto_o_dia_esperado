package br.com.unasp.projeto.repository.timeline;

import java.util.List;

import br.com.unasp.projeto.models.TimeLinePhotosModel;

public interface TimeLineDao {

	public List<TimeLinePhotosModel> getPicturesList(Integer idGrooms);
	
	public void save(TimeLinePhotosModel timelineModel);
}
