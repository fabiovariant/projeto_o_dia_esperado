package br.com.unasp.projeto.repository.invitation;

import br.com.unasp.projeto.models.InvitationModel;

public interface InvitationDao {

	public InvitationModel get(Integer id) ;
    
    public InvitationModel save(InvitationModel invitationModel);
    
    public InvitationModel update(InvitationModel invitationModel);
    
}
