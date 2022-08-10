package org.iesalixar.servidor.services;

import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Departamento;

public interface DepartamentoService {
	
	public List<Departamento> getAllDepartamentos();
	public Optional<Departamento> findDepartamentoById(Long id);
	public Departamento getDepartamentoByName(String nombre);
	public Departamento insertarDepartamento(Departamento departamento);


}
