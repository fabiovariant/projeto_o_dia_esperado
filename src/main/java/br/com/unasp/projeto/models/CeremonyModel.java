package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_ceremony_data")
@Entity
public class CeremonyModel {
	
	@Id
	@Column(name = "id_grooms")
	private Integer idGrooms;
	@Column(name = "civil_date")
	private String civilDate;
	@Column(name = "religious_date")
	private String religiousDate;
	@Column(name = "alliance")
	private String alliance;
	@Column(name = "registry")
	private String registry;
	@Column(name = "bridesmaid")
	private String bridesmaid;
	@Column(name = "documentation")
	private String documentation;
	@Column(name = "father_and_church")
	private String fatherAndChurch;
	@Column(name = "godparents")
	private String godparents;
	@Column(name = "bridge_clothing")
	private String bridgeClothing;
	@Column(name = "groom_clothing")
	private String groomClothing;
	@Column(name = "witnesses")
	private String witnesses;
	
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
	public String getAlliance() {
		return alliance;
	}
	public void setAlliance(String alliance) {
		this.alliance = alliance;
	}
	public String getRegistry() {
		return registry;
	}
	public void setRegistry(String registry) {
		this.registry = registry;
	}
	public String getBridesmaid() {
		return bridesmaid;
	}
	public void setBridesmaid(String bridesmaid) {
		this.bridesmaid = bridesmaid;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	public String getFatherAndChurch() {
		return fatherAndChurch;
	}
	public void setFatherAndChurch(String fatherAndChurch) {
		this.fatherAndChurch = fatherAndChurch;
	}
	public String getGodparents() {
		return godparents;
	}
	public void setGodparents(String godparents) {
		this.godparents = godparents;
	}
	public String getBridgeClothing() {
		return bridgeClothing;
	}
	public void setBridgeClothing(String bridgeClothing) {
		this.bridgeClothing = bridgeClothing;
	}
	public String getGroomClothing() {
		return groomClothing;
	}
	public void setGroomClothing(String groomClothing) {
		this.groomClothing = groomClothing;
	}
	public String getWitnesses() {
		return witnesses;
	}
	public void setWitnesses(String witnesses) {
		this.witnesses = witnesses;
	}
}
