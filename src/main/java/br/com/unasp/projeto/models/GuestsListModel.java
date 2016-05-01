package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_guests_list_data")
@Entity
public class GuestsListModel {
	
	@Id
	@Column(name = "id_grooms")
	private Integer idGrooms;
	@Column(name = "invited_name")
	private String invitedName;
	@Column(name = "email_invited")
	private String emailInvited;
	@Column(name = "is_confirmed")
	private Boolean isConfirmed;
	
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
