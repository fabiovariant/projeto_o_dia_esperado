package br.com.unasp.projeto.models;

import java.util.List;

public class TimelineModel {

	private Integer idGrooms;
	private String civilDate;
	private String religiousDate;
	private String perfectDressDate;
	private List<TimeLinePhotosModel> photosModel;

	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}
	public String getCivilDate() {
		return civilDate;
	}
	public void setCivilDate(String civilDate) {
		this.civilDate = civilDate;
	}
	public String getReligiousDate() {
		return religiousDate;
	}
	public void setReligiousDate(String religiousDate) {
		this.religiousDate = religiousDate;
	}
	public String getPerfectDressDate() {
		return perfectDressDate;
	}
	public void setPerfectDressDate(String perfectDressDate) {
		this.perfectDressDate = perfectDressDate;
	}
	public List<TimeLinePhotosModel> getPhotosModel() {
		return photosModel;
	}
	public void setPhotosModel(List<TimeLinePhotosModel> photosModel) {
		this.photosModel = photosModel;
	}
}
