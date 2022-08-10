package org.iesalixar.servidor.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grado")
public class Grado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre",unique=true, nullable=false)
	private String nombre;
	

	@OneToMany(mappedBy="grado",cascade=CascadeType.ALL,orphanRemoval = true)
	private Set<Asignatura> asignaturas;



	public Grado() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	



	@Override
	public int hashCode() {
		return Objects.hash(asignaturas, id, nombre);
	}
	

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignatura) {
		this.asignaturas = asignatura;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grado other = (Grado) obj;
		return Objects.equals(asignaturas, other.asignaturas) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre);
	}


	//HELPERS
	public void  addAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
		asignatura.setGrado(this);
	}
	
	public void  removeAsignatura(Asignatura asignatura) {
		this.asignaturas.remove(asignatura);
		asignatura.setGrado(null); 
	}
	

	
	

	
	
}
