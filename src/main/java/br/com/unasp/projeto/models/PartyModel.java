package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_party_data")
@Entity
public class PartyModel {
	
	@Id
	@Column(name="id_grooms")
	private Integer idGrooms;
	@Column(name="drinks")
	private String drinks;
	@Column(name="cake_candy")
	private String cakeCandy;
	@Column(name="buffet")
	private String buffet;
	@Column(name="car")
	private String car;
	@Column(name="decoration")
	private String decoration;
	@Column(name="photo_and_video")
	private String photoAndVideo;
	@Column(name="locale")
	private String locale;
	@Column(name="safety")
	private String safety;
	@Column(name="sound")
	private String sound;
	@Column(name="valet")
	private String valet;
	@Column(name="party_date")
	private String partyDate;
	
	public String getPartyDate() {
		return partyDate;
	}
	public void setPartyDate(String partyDate) {
		this.partyDate = partyDate;
	}
	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}
	public String getDrinks() {
		return drinks;
	}
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
	public String getCakeCandy() {
		return cakeCandy;
	}
	public void setCakeCandy(String cakeCandy) {
		this.cakeCandy = cakeCandy;
	}
	public String getBuffet() {
		return buffet;
	}
	public void setBuffet(String buffet) {
		this.buffet = buffet;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getDecoration() {
		return decoration;
	}
	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}
	public String getPhotoAndVideo() {
		return photoAndVideo;
	}
	public void setPhotoAndVideo(String photoAndVideo) {
		this.photoAndVideo = photoAndVideo;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getSafety() {
		return safety;
	}
	public void setSafety(String safety) {
		this.safety = safety;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getValet() {
		return valet;
	}
	public void setValet(String valet) {
		this.valet = valet;
	}
}
