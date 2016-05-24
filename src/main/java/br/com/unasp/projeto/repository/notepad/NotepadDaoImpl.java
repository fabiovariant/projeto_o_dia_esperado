package br.com.unasp.projeto.repository.notepad;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.unasp.projeto.models.NotepadModel;

@Repository("notepadDao")
public class NotepadDaoImpl implements NotepadDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<NotepadModel> getNotepads(Integer groomsId) {
		TypedQuery<NotepadModel> query =
				entityManager.createQuery("SELECT c FROM NotepadModel c where c.idGrooms = :id", NotepadModel.class)
				.setParameter("id", groomsId);
		List<NotepadModel> notepadModelsList = query.getResultList();
		
		return notepadModelsList;
	}

	@Override
	public NotepadModel save(NotepadModel notepadModel) {
		entityManager.persist(notepadModel);
		entityManager.flush();
		return notepadModel;
	}

	@Transactional
	@Override
	public NotepadModel update(NotepadModel notepadModel) {
		NotepadModel notepadModelUpdate = entityManager.find(NotepadModel.class, notepadModel.getIdGrooms());
		if(notepadModelUpdate != null){
			notepadModelUpdate.setAnnotation(notepadModel.getAnnotation());
		}
		return notepadModelUpdate;
	}

}
