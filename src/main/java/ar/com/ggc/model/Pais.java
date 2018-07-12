package ar.com.ggc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class Pais {
	@Id 
	@GeneratedValue
	@Column(name="idPais")
	private Long idPais;
	
	@Column(name="descripcionPais")
	private String descripcionPais;
	
	@Column(name="activo")
	private Boolean activo;
	
	
	public Long getIdPais() {
		return idPais;
	}
	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}
	public String getDescripcionPais() {
		return descripcionPais;
	}
	public void setDescripcionPais(String descripcionPais) {
		this.descripcionPais = descripcionPais;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
}
