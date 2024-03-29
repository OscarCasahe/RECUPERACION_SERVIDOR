package org.iesalixar.servidor.repository;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura,Long> {

	public Asignatura findByNombre(String nombre);
	public Asignatura findById(String id);



	
}
