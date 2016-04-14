package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_grooms_data", schema = "public")
public class GroomsModel {
	
	@Id
	@GeneratedValue
	@Column(name = "id_grooms")
	private Integer id;	

	@Column(name = "nm_grooms")
	private String nmBride;	

	@Column(name = "nm_bride")
	private String nmGroom;

	@Column(name = "id_ceremony")
	private PartyModel idCeremony;	

	@Column(name = "id_party")
	private Integer idParty;

	@Column(name = "id_dress_check")
	private Integer idDressCheck;

	@Column(name = "id_invitation")
	@OneToMany
	private Integer idInvitation;

	@Column(name = "id_guests_list")
	private Integer idGuestsList;

	@Column(name = "id_notepad")
	private Integer idNotepad;

	@Column(name = "id_providers")
	private Integer idProviders;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNmBride() {
		return nmBride;
	}
	public void setNmBride(String nmBride) {
		this.nmBride = nmBride;
	}
	public String getNmGroom() {
		return nmGroom;
	}
	public void setNmGroom(String nmGroom) {
		this.nmGroom = nmGroom;
	}
	public PartyModel getIdCeremony() {
		return idCeremony;
	}
	public void setIdCeremony(PartyModel idCeremony) {
		this.idCeremony = idCeremony;
	}
	public Integer getIdParty() {
		return idParty;
	}
	public void setIdParty(Integer idParty) {
		this.idParty = idParty;
	}
	public Integer getIdDressCheck() {
		return idDressCheck;
	}
	public void setIdDressCheck(Integer idDressCheck) {
		this.idDressCheck = idDressCheck;
	}
	public Integer getIdInvitation() {
		return idInvitation;
	}
	public void setIdInvitation(Integer idInvitation) {
		this.idInvitation = idInvitation;
	}
	public Integer getIdGuestsList() {
		return idGuestsList;
	}
	public void setIdGuestsList(Integer idGuestsList) {
		this.idGuestsList = idGuestsList;
	}
	public Integer getIdNotepad() {
		return idNotepad;
	}
	public void setIdNotepad(Integer idNotepad) {
		this.idNotepad = idNotepad;
	}
	public Integer getIdProviders() {
		return idProviders;
	}
	public void setIdProviders(Integer idProviders) {
		this.idProviders = idProviders;
	}
	
}
