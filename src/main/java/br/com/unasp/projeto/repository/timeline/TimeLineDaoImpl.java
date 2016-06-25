package br.com.unasp.projeto.repository.timeline;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.TimeLinePhotosModel;

@Repository("timeLineDao")
public class TimeLineDaoImpl implements TimeLineDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<TimeLinePhotosModel> getPicturesList(Integer idGrooms) {
		TypedQuery<TimeLinePhotosModel> query =
				entityManager.createQuery("SELECT c FROM TimeLinePhotosModel c where c.idGrooms = :id", TimeLinePhotosModel.class)
				.setParameter("id", idGrooms);
		List<TimeLinePhotosModel> timeLineModel = query.getResultList();
		
		return timeLineModel;
	}

	@Override
	public void save(TimeLinePhotosModel timelineModel) {
		entityManager.persist(timelineModel);
	}

}
