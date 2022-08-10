package org.iesalixar.servidor.repository;

import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradoRepository extends JpaRepository<Grado,Long> {

	public Grado findByNombre(String name);
	public Grado findById(String id);

	
}
