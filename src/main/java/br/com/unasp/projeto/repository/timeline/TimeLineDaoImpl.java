package br.com.unasp.projeto.repository.timeline;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.TimelineModel;

@Repository("timeLineDao")
public class TimeLineDaoImpl implements TimeLineDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<TimelineModel> getPicturesList(Integer idGrooms) {
		TypedQuery<TimelineModel> query =
				entityManager.createQuery("SELECT c FROM TimelineModel c where c.idGrooms = :id", TimelineModel.class)
				.setParameter("id", idGrooms);
		List<TimelineModel> timeLineModel = query.getResultList();
		
		return timeLineModel;
	}

	@Override
	public void save(TimelineModel timelineModel) {
		entityManager.persist(timelineModel);
	}

}
