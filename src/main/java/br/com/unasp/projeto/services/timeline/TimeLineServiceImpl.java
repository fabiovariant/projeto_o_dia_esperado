package br.com.unasp.projeto.services.timeline;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.unasp.projeto.models.TimeLinePhotosModel;
import br.com.unasp.projeto.models.TimelineModel;
import br.com.unasp.projeto.repository.ceremony.CeremonyDao;
import br.com.unasp.projeto.repository.dress.DressCheckDao;
import br.com.unasp.projeto.repository.timeline.TimeLineDao;

@Service("timeLineService")
public class TimeLineServiceImpl implements TimeLineService{

	@Autowired
	TimeLineDao timeLineDao;
	@Autowired
	CeremonyDao ceremonyDao;
	@Autowired
	DressCheckDao dressCheckDao;
	
	@Override
	public TimelineModel getPicturesList(Integer idGrooms) {
		TimelineModel timeLineModel = new TimelineModel();
		timeLineModel.setCivilDate(ceremonyDao.get(idGrooms).getCivilDate());
		timeLineModel.setReligiousDate(ceremonyDao.get(idGrooms).getReligiousDate());
		timeLineModel.setPerfectDressDate(dressCheckDao.get(idGrooms).getPerfectDate());
		timeLineModel.setPhotosModel(timeLineDao.getPicturesList(idGrooms));
		return timeLineModel;
	}

	@Override
	public void savePicture(TimeLinePhotosModel photosModel, MultipartFile file) {
		
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = 
                		new BufferedOutputStream(new FileOutputStream(
                				new File("C:\\fotos\\"+photosModel.getIdGrooms() + photosModel.getDate() +"-uploaded")));
                stream.write(bytes);
                stream.close();
                photosModel.setLocation("C:\\fotos\\"+photosModel.getIdGrooms() + photosModel.getDate() +"-uploaded");
                photosModel.setDate(Calendar.getInstance().getTime().toString());
                timeLineDao.save(photosModel);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("You failed to upload because the file was empty.");
        }
	}

}
