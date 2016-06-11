package br.com.unasp.projeto.services.timeline;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.unasp.projeto.models.TimelineModel;
import br.com.unasp.projeto.repository.timeline.TimeLineDao;

@Service("timeLineService")
public class TimeLineServiceImpl implements TimeLineService{

	@Autowired
	TimeLineDao timeLineDao;
	
	@Override
	public List<TimelineModel> getPicturesList(Integer idGrooms) {
		return timeLineDao.getPicturesList(idGrooms);
	}

	@Override
	public void save(TimelineModel timelineModel, MultipartFile file) {
		
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = 
                		new BufferedOutputStream(new FileOutputStream(
                				new File("C:\\fotos\\"+timelineModel.getIdGrooms() + timelineModel.getDate() +"-uploaded")));
                stream.write(bytes);
                stream.close();
                timelineModel.setLocation("C:\\fotos\\"+timelineModel.getIdGrooms() + timelineModel.getDate() +"-uploaded");
                timelineModel.setDate(Calendar.getInstance().getTime().toString());
                timeLineDao.save(timelineModel);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("You failed to upload because the file was empty.");
        }
	}

}
