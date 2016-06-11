package br.com.unasp.projeto.models.idModels;

import java.io.Serializable;

public class GuestListId implements Serializable{
	
	private static final long serialVersionUID = -254255025572165188L;
	
	private String emailInvited;
	private Integer idGrooms;
	
	public GuestListId(){}
	
	public GuestListId(String emailInvited, Integer idGrooms) {
		this.emailInvited = emailInvited;
		this.idGrooms = idGrooms;
	}

	public String getEmailInvited() {
		return emailInvited;
	}
	public void setEmailInvited(String emailInvited) {
		this.emailInvited = emailInvited;
	}
	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailInvited == null) ? 0 : emailInvited.hashCode());
		result = prime * result + ((idGrooms == null) ? 0 : idGrooms.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuestListId other = (GuestListId) obj;
		if (emailInvited == null) {
			if (other.emailInvited != null)
				return false;
		} else if (!emailInvited.equals(other.emailInvited))
			return false;
		if (idGrooms == null) {
			if (other.idGrooms != null)
				return false;
		} else if (!idGrooms.equals(other.idGrooms))
			return false;
		return true;
	}
}
