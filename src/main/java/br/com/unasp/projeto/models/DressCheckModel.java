package br.com.unasp.projeto.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class DressCheckModel {

	@Id
	@GeneratedValue
	@Column(name = "id_dress_check")
	private Integer idDressCheck;
	
	@Column(name = "dress_check")
	private List<Date> dressCheck;
	
	@Column(name = "is_perfect")
	private Boolean isPerfect;
	
	@Column(name = "take_date")
	private Date takeDate;
	
	@Column(name = "devolution_date")
	private Date devolutionDate;
	
	public Integer getIdDressCheck() {
		return idDressCheck;
	}
	public void setIdDressCheck(Integer idDressCheck) {
		this.idDressCheck = idDressCheck;
	}
	public List<Date> getDressCheck() {
		return dressCheck;
	}
	public void setDressCheck(List<Date> dressCheck) {
		this.dressCheck = dressCheck;
	}
	public Boolean getIsPerfect() {
		return isPerfect;
	}
	public void setIsPerfect(Boolean isPerfect) {
		this.isPerfect = isPerfect;
	}
	public Date getTakeDate() {
		return takeDate;
	}
	public void setTakeDate(Date takeDate) {
		this.takeDate = takeDate;
	}
	public Date getDevolutionDate() {
		return devolutionDate;
	}
	public void setDevolutionDate(Date devolutionDate) {
		this.devolutionDate = devolutionDate;
	}
}
