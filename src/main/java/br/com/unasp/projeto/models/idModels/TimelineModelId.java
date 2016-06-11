package br.com.unasp.projeto.models.idModels;

import java.io.Serializable;

public class TimelineModelId implements Serializable {

	private static final long serialVersionUID = 6666645850522634988L;

	private Integer idGrooms;
	private String location;
	
	public TimelineModelId(Integer idGrooms, String location) {
		this.idGrooms = idGrooms;
		this.location = location;
	}

	public TimelineModelId() {
	}

	public Integer getIdGrooms() {
		return idGrooms;
	}

	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idGrooms == null) ? 0 : idGrooms.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
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
		TimelineModelId other = (TimelineModelId) obj;
		if (idGrooms == null) {
			if (other.idGrooms != null)
				return false;
		} else if (!idGrooms.equals(other.idGrooms))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	
}
