package br.com.unasp.projeto.repository.invitation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public InvitationModel update(InvitationModel invitationModel) {
		InvitationModel invitationModelUpdate = get(invitationModel.getIdGrooms());
		if(invitationModelUpdate != null){
			invitationModelUpdate.setInvitation(invitationModel.getInvitation());
			invitationModelUpdate.setMenu(invitationModel.getMenu());
			invitationModelUpdate.setDecotarionDetails(invitationModel.getDecotarionDetails());
			invitationModelUpdate.setSouvenirs(invitationModel.getSouvenirs());
			invitationModelUpdate.setGodParentsGift(invitationModel.getGodParentsGift());
			invitationModelUpdate.setReservation(invitationModel.getReservation());
		}
		return invitationModelUpdate;
	}
}
