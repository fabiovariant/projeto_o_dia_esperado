package br.com.unasp.projeto.repository.timeline;

import java.util.List;

import br.com.unasp.projeto.models.TimelineModel;

public interface TimeLineDao {

	public List<TimelineModel> getPicturesList(Integer idGrooms);
	
	public void save(TimelineModel timelineModel);
}
