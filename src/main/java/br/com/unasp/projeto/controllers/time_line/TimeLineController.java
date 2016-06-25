package br.com.unasp.projeto.controllers.time_line;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import br.com.unasp.projeto.controllers.JsonResponse;
import br.com.unasp.projeto.models.TimeLinePhotosModel;
import br.com.unasp.projeto.models.TimelineModel;
import br.com.unasp.projeto.services.timeline.TimeLineService;

@RequestMapping(value = "/timeline")
@Controller
public class TimeLineController {

	@Autowired
	TimeLineService timeLineService;

	@RequestMapping(value = "/{id}",
			method = RequestMethod.GET)
	@ResponseBody
	public TimelineModel get(@PathVariable("id") Integer idGrooms){
		return timeLineService.getPicturesList(idGrooms);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/{id}")
	@ResponseBody
	public JsonResponse save(@RequestParam("file") MultipartFile file, @PathVariable("id") Integer idGrooms){
		TimeLinePhotosModel timelineModel = new TimeLinePhotosModel();
		timelineModel.setIdGrooms(idGrooms);
		timeLineService.savePicture(timelineModel, file);
		JsonResponse response = new JsonResponse();
		response.setStatus(true);
		return response;
	}
}
