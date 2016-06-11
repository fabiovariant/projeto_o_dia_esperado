package br.com.unasp.projeto.services.timeline;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import br.com.unasp.projeto.models.TimelineModel;

public interface TimeLineService {

	public List<TimelineModel> getPicturesList(Integer idGrooms);
	
	public void save(TimelineModel timelineModel, MultipartFile file);
}
