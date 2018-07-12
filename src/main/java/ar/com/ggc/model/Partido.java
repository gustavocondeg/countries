package ar.com.ggc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class Partido {
	@Id
	@GeneratedValue
	@Column(name="idPartido")
	private Long idPartido;
	
	@Column(name="descripcionPartido")
	private String descripcionPartido;
	
	@ManyToOne
	@Column(name="idProvincia")
	private Provincia provincia;
	
	@Column(name="activo")
	private Boolean activo;

	public Partido(){
		
	}
	
	public Partido(String descripcionPartido, Provincia provincia){
		this.descripcionPartido = descripcionPartido;
		this.provincia = provincia;
		this.activo = true;
	}

	public Long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}

	public String getDescripcionPartido() {
		return descripcionPartido;
	}

	public void setDescripcionPartido(String descripcionPartido) {
		this.descripcionPartido = descripcionPartido;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	
}
