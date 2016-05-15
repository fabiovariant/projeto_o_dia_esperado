package br.com.unasp.projeto.services.invitation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unasp.projeto.models.InvitationModel;
import br.com.unasp.projeto.repository.invitation.InvitationDao;

@Service("invitationService")
public class InvitationServiceImpl implements InvitationService{

	@Autowired
	InvitationDao invitationDao;

	@Override
	public InvitationModel update(InvitationModel invitationModel) {
		return invitationDao.update(invitationModel);
	}

	@Override
	public InvitationModel get(Integer groomsId) {
		return invitationDao.get(groomsId);
	}

	@Override
	public InvitationModel save(InvitationModel invitationModel) {
		return invitationDao.save(invitationModel);
	}

}
