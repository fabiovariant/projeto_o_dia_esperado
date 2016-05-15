package br.com.unasp.projeto.services.invitation;

import br.com.unasp.projeto.models.InvitationModel;

public interface InvitationService {

	public InvitationModel update(InvitationModel invitationModel);
	
	public InvitationModel get(Integer groomsId);
	
	public InvitationModel save(InvitationModel invitationModel);
}
