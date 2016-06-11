package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import br.com.unasp.projeto.models.idModels.TimelineModelId;

@Table(name="tb_time_line_data")
@Entity
@IdClass(TimelineModelId.class)
public class TimelineModel {

	@Id
	@Column(name = "id_grooms")
	Integer idGrooms;
	@Id
	@Column(name = "location")
	String location;
	@Column(name="picture_text")
	String pictureText;
	@Column(name="dt_upload")
	String date;
	
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPictureText() {
		return pictureText;
	}
	public void setPictureText(String pictureText) {
		this.pictureText = pictureText;
	}
}
