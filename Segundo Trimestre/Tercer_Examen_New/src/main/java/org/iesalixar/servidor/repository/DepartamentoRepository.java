package org.iesalixar.servidor.repository;

import org.iesalixar.servidor.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {

	public Departamento findByNombre(String name);
	public Departamento findById(String id);

	
}
