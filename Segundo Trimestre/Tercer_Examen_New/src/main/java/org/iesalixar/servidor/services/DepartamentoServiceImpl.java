package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Departamento;
import org.iesalixar.servidor.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	DepartamentoRepository departamentoRepo;

	@Override
	public List<Departamento> getAllDepartamentos() {

		// Obtengo el resultado a través del repositorio
		List<Departamento> dptoBD = departamentoRepo.findAll();

		// Verificando que he obtenido algo
		if (dptoBD != null && dptoBD.size() > 0) {

			return dptoBD;
		}

		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Departamento>();
	}

	@Override
	public Optional<Departamento> findDepartamentoById(Long i) {
		
		Optional<Departamento> departamento = null;
		
		if (i!=null) {
			departamento = departamentoRepo.findById(i);
		}
		
		return departamento;
		
	}
	
	@Override
	public Departamento getDepartamentoByName(String nombre) {
		
		if (nombre!=null) {
		
			Departamento departamento =departamentoRepo.findByNombre(nombre);
			
			return departamento; 			
		}
		
		return null;
	}
	
	@Override
	public Departamento insertarDepartamento(Departamento departamento) {
		
		if (departamento!=null && getDepartamentoByName(departamento.getNombre())==null) {
			Departamento departamentoBD = departamentoRepo.save(departamento);
			return departamento;
		}
		
		return null;
	}



}
