package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_grooms_data")
@Entity
public class GroomsModel{

	@Id
	@SequenceGenerator( name = "CLIENTE_ID", sequenceName = "CLIENTE_SEQ", allocationSize = 1 )
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "CLIENTE_ID" )
	@Column(name = "id_grooms")
	private Integer idGrooms;
	@Column(name = "nm_groom")
	private String nmGroom;
	@Column(name = "nm_bridge")
	private String nmBridge;
	@Column(name = "grooms_email")
	private String groomsEmail;
	@Column(name = "gr_password")
	private String grPassword;
	
	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}
	public String getNmGroom() {
		return nmGroom;
	}
	public void setNmGroom(String nmGroom) {
		this.nmGroom = nmGroom;
	}
	public String getNmBridge() {
		return nmBridge;
	}
	public void setNmBridge(String nmBridge) {
		this.nmBridge = nmBridge;
	}
	public String getGroomsEmail() {
		return groomsEmail;
	}
	public void setGroomsEmail(String groomsEmail) {
		this.groomsEmail = groomsEmail;
	}
	public String getGrPassword() {
		return grPassword;
	}
	public void setGrPassword(String grPassword) {
		this.grPassword = grPassword;
	}	
}
