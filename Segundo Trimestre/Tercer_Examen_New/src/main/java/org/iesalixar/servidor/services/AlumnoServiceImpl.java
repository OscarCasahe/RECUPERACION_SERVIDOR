package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	AlumnoRepository alumRepo;

	@Override
	public Optional<Alumno> findAlumnoById(Long id) {
		// TODO Auto-generated method stub
		return alumRepo.findById(id);
	}
	
	@Override
	public Optional<Alumno> findAlumnoByNif(String nif) {
		// TODO Auto-generated method stub
		return alumRepo.findByNif(nif);
	}

	@Override
	public void deleteAlumnoById(Long id) {
		alumRepo.deleteById(id);
		
	}

	@Override
	public Alumno actualizarAlumno(Alumno alumno) {
		if (alumno==null || alumno.getId() ==null ) {
			return null;
		}
		
		return alumRepo.save(alumno);
	}

	@Override
	public List<Alumno> getAllAlumnos() {
		//Obtengo el resultado a través del repositorio
				List<Alumno> alumBD = alumRepo.findAll();		
				
				
				//Verificando que he obtenido algo 
				if (alumBD!= null && alumBD.size()> 0) {
					
					return alumBD;
				}
				
				//No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
				return new ArrayList<Alumno>(); 
	}

	@Override
	public Alumno insertarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub

		Alumno alum = alumRepo.save(alumno);
		return alum;
	}

	

}
