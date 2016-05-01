package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_invitation_data")
@Entity
public class InvitationModel {

	@Id
	@Column(name = "id_grooms")
	private Integer idGrooms;
	@Column(name = "invitation")
	private String invitation;
	@Column(name = "menu")
	private String menu;
	@Column(name = "decotarion_details")
	private String decotarionDetails;
	@Column(name = "souvenirs")
	private String souvenirs;
	@Column(name = "god_parents_gift")
	private String godParentsGift;
	@Column(name = "reservation")
	private String reservation;
	
	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}
	public String getInvitation() {
		return invitation;
	}
	public void setInvitation(String invitation) {
		this.invitation = invitation;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getDecotarionDetails() {
		return decotarionDetails;
	}
	public void setDecotarionDetails(String decotarionDetails) {
		this.decotarionDetails = decotarionDetails;
	}
	public String getSouvenirs() {
		return souvenirs;
	}
	public void setSouvenirs(String souvenirs) {
		this.souvenirs = souvenirs;
	}
	public String getGodParentsGift() {
		return godParentsGift;
	}
	public void setGodParentsGift(String godParentsGift) {
		this.godParentsGift = godParentsGift;
	}
	public String getReservation() {
		return reservation;
	}
	public void setReservation(String reservation) {
		this.reservation = reservation;
	}
}
