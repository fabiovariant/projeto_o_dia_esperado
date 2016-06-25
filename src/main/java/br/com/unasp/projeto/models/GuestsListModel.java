package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import br.com.unasp.projeto.models.idModels.GuestListId;

@Table(name = "tb_guests_list_data")
@Entity
@IdClass(GuestListId.class)
public class GuestsListModel {
	
	@Id
	@Column(name = "id_grooms")
	private Integer idGrooms;
	@Column(name = "invited_name")
	private String invitedName;
	@Id
	@Column(name = "email_invited")
	private String emailInvited;
	@Column(name = "is_confirmed")
	private Boolean isConfirmed;
	@Column(name = "email_text")
	private String emailText;
	
	public String getEmailText() {
		return emailText;
	}
	public void setEmailText(String emailText) {
		this.emailText = emailText;
	}
	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}
	public String getInvitedName() {
		return invitedName;
	}
	public void setInvitedName(String invitedName) {
		this.invitedName = invitedName;
	}
	public String getEmailInvited() {
		return emailInvited;
	}
	public void setEmailInvited(String emailInvited) {
		this.emailInvited = emailInvited;
	}
	public Boolean getIsConfirmed() {
		return isConfirmed;
	}
	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
}
