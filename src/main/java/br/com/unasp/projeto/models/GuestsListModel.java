package br.com.unasp.projeto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.tuple.Pair;

@Entity(name = "tb_invitation_data")
public class GuestsListModel {

	//TODO PENSAR EM COMO FAZER A LISTA DE PARES DE MANEIRA ADEQUEDA
	//IDEIA USAR O APACHE PAIR
	@Id
	@ManyToOne
	@JoinColumn(name = "papada")//FIXME
	private Integer idGrooms;
	
	private String invitedName;
	
	private String emailInvited;
	
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
