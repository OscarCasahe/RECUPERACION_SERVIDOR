package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.model.Profesor;
import org.iesalixar.servidor.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	ProfesorRepository profesorRepo;

	@Override
	public List<Profesor> getAllProfesores() {

		// Obtengo el resultado a través del repositorio
		List<Profesor> asignBD = profesorRepo.findAll();

		// Verificando que he obtenido algo
		if (asignBD != null && asignBD.size() > 0) {

			return asignBD;
		}

		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Profesor>();
	}

	@Override
	public Optional<Profesor> findProfesorById(Long id) {
		
		Optional<Profesor> profesor = null;
		
		if (id!=null) {
			profesor = profesorRepo.findById(id);
		}
		
		return profesor;
		
	}
	
	@Override
	public Profesor insertarProfesor(Profesor profesor) {
		
		if (profesor!=null) {
			Profesor profesorBD = profesorRepo.save(profesor);
			return profesorBD;
		}
		
		return null;
	}

	@Override
	public Profesor getProfesorByName(String nombre) {
		if (nombre!=null) {
			
			Profesor profesor =profesorRepo.findByNombre(nombre);
			
			return profesor; 			
		}
		
		return null;
	}

}
