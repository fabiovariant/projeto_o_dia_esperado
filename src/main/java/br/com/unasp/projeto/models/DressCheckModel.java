package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_dress_check_data")
@Entity
public class DressCheckModel {

	@Id
	@Column(name = "id_grooms")
	private Integer  idGrooms;
	@Column(name = "dress_check")
	private String  dressCheck;
	@Column(name = "take_date")
	private String  takeDate;
	@Column(name = "devolution_date")
	private String  devolutionDate;
	@Column(name = "perfect_date")
	private String perfectDate;
	
	public String getPerfectDate() {
		return perfectDate;
	}
	public void setPerfectDate(String perfectDate) {
		this.perfectDate = perfectDate;
	}
	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}
	public String getDressCheck() {
		return dressCheck;
	}
	public void setDressCheck(String dressCheck) {
		this.dressCheck = dressCheck;
	}
	public String getTakeDate() {
		return takeDate;
	}
	public void setTakeDate(String takeDate) {
		this.takeDate = takeDate;
	}
	public String getDevolutionDate() {
		return devolutionDate;
	}
	public void setDevolutionDate(String devolutionDate) {
		this.devolutionDate = devolutionDate;
	}
}
