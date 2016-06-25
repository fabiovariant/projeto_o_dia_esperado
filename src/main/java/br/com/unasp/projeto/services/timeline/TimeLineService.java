package br.com.unasp.projeto.services.timeline;


import org.springframework.web.multipart.MultipartFile;

import br.com.unasp.projeto.models.TimeLinePhotosModel;
import br.com.unasp.projeto.models.TimelineModel;

public interface TimeLineService {

	public TimelineModel getPicturesList(Integer idGrooms);
	
	public void savePicture(TimeLinePhotosModel timelineModel, MultipartFile file);
}
