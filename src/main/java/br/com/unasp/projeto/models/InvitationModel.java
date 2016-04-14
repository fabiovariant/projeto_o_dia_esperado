package br.com.unasp.projeto.models;

import javax.persistence.Column;

public class InvitationModel {

	@Column(name = "invitation")
	private String invitation;
	
	@Column(name = "menu")
	private String menu;
	
	@Column(name = "decotarion_details")
	private String decorationDetail;
	
	@Column(name = "souvenirs")
	private String souvenirs;
	
	@Column(name = "god_parents_gift")
	private String godParentsGift;
	
	@Column(name = "reservation")
	private String  reservation;
	
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
	public String getDecorationDetail() {
		return decorationDetail;
	}
	public void setDecorationDetail(String decorationDetail) {
		this.decorationDetail = decorationDetail;
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
