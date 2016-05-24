package br.com.unasp.projeto.repository.guest;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.unasp.projeto.models.GuestsListModel;

@Repository("guestListDao")
public class GuestListDaoImpl implements GuestListDao {


	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public void confirmGuest(String invitedEmail) {
	    try {
	    	entityManager.createQuery("Update GuestsListModel u SET isConfirmed = true where u.emailInvited = :userEmail")
	    		.setParameter("userEmail", invitedEmail).executeUpdate();
      } catch (NoResultException e) {
    	  
      }
	}

	@Override
	public GuestsListModel get(Integer id) {
		GuestsListModel groomsModel =  entityManager.find(GuestsListModel.class, id);
    	return groomsModel;
	}

	@Override
	public GuestsListModel save(GuestsListModel guestsListModel) {
		entityManager.persist(guestsListModel);
		return guestsListModel;
	}

	@Transactional
	@Override
	public GuestsListModel update(GuestsListModel guestsListModel) {
		GuestsListModel guestsListModelUpdate = get(guestsListModel.getIdGrooms());
		if(guestsListModel != null){
			guestsListModelUpdate.setInvitedName(guestsListModel.getInvitedName());
			guestsListModelUpdate.setEmailInvited(guestsListModel.getEmailInvited());
			guestsListModelUpdate.setIsConfirmed(guestsListModel.getIsConfirmed());
		}
		return guestsListModelUpdate;
	}

}
