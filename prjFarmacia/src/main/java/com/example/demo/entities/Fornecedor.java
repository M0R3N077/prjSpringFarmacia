package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min=8,message="minimo de 8 caracteres")
	private String cnpj;
	private String nameFantasy;
	private String phone;
	private String address;
	private String email;
	@NotNull
	@Size(min=3,message="minimo de 3 caracteres")
	private String inscricaoEstadual;
	private String razaoSocial;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getNameFantasy() {
		return nameFantasy;
	}
	
	public void setNameFantasy(String nameFantasy) {
		this.nameFantasy=nameFantasy;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual=inscricaoEstadual;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial=razaoSocial;
	}


}
