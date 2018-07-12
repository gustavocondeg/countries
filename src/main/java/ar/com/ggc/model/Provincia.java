package ar.com.ggc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Proxy;

@Entity 
@Proxy(lazy=false)
public class Provincia {
	@Id 
	@GeneratedValue
	@Column(name="idProvincia")
	private Long idProvincia;
	
	@Column(name="descripcionProvincia")
	private String descripcionProvincia;
	
	@ManyToOne
	@JoinColumn(name="idPais")
	private Pais pais;
	
	@Column(name="activo")
	private Boolean activo;
	
	public Provincia(String descripcionProvincia, Pais pais){
		this.descripcionProvincia = descripcionProvincia;
		this.pais = pais;
		this.activo = true;
	}
	
	public Long getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getDescripcionProvincia() {
		return descripcionProvincia;
	}
	public void setDescripcionProvincia(String descripcionProvincia) {
		this.descripcionProvincia = descripcionProvincia;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
}
