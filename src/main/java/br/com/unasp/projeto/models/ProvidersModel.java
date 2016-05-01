package br.com.unasp.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_providers_data")
@Entity
public class ProvidersModel {

	@Id
	@Column(name = "id_grooms")
	private Integer idGrooms;
	@Column(name = "provider_name")
	private String providerName;
	@Column(name = "area")
	private String area;
	@Column(name = "is_confirmed")
	private String isConfirmed;
	@Column(name = "provider_site")
	private String providerSite;
	@Column(name = "price")
	private String price;
	@Column(name = "provider_phone")
	private String providerPhone;
	
	public Integer getIdGrooms() {
		return idGrooms;
	}
	public void setIdGrooms(Integer idGrooms) {
		this.idGrooms = idGrooms;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getIsConfirmed() {
		return isConfirmed;
	}
	public void setIsConfirmed(String isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public String getProviderSite() {
		return providerSite;
	}
	public void setProviderSite(String providerSite) {
		this.providerSite = providerSite;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProviderPhone() {
		return providerPhone;
	}
	public void setProviderPhone(String providerPhone) {
		this.providerPhone = providerPhone;
	}
}
