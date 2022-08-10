package org.iesalixar.servidor.repository;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,Long> {


	Profesor findByNombre(String nombre);

	
}
