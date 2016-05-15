package br.com.unasp.projeto.repository.invitation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.InvitationModel;

@Repository("invitationDao")
public class InvitationDaoImpl implements InvitationDao {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public InvitationModel get(Integer id) {
		InvitationModel invitationModel =  entityManager.find(InvitationModel.class, id);
    	return invitationModel;
	}

	@Override
	public InvitationModel save(InvitationModel invitationModel) {
		entityManager.persist(invitationModel);
		entityManager.flush();
		return invitationModel;
	}

	@Override
	public InvitationModel update(InvitationModel invitationModel) {
		return entityManager.merge(invitationModel);
	}
}
