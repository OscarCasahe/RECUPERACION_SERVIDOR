package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.model.AlumnoAsignatura;
import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.repository.AlumnoAsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AlumnoAsignaturaServiceImpl implements AlumnoAsignaturaService {
	
	@Autowired
	AlumnoAsignaturaRepository alumAsigRepo;

	@Override
	public AlumnoAsignatura findAlumnoAsignaturaById(Alumno id, Asignatura id1) {
		// TODO Auto-generated method stub
		if (id!=null && id1!=null) {
			
			AlumnoAsignatura alumAsig = (AlumnoAsignatura) alumAsigRepo.findByAlumnoAndAsignatura(id, id1);
			
			return alumAsig; 			
		}
		
		return null;
	}

	@Override
	public void deleteAlumnoAsignaturaById(AlumnoAsignatura alumnoAsignatura) {
		// TODO Auto-generated method stub
		alumAsigRepo.delete(alumnoAsignatura);;
	}

	@Override
	public AlumnoAsignatura actualizarAlumnoAsignaturas(AlumnoAsignatura alumnoAsignatura) {
		if (alumnoAsignatura==null || alumnoAsignatura.getAlumno()==null || alumnoAsignatura.getAsignatura()==null) {
			return null;			
		}
		return alumAsigRepo.save(alumnoAsignatura);
	}

	@Override
	public List<AlumnoAsignatura> getAllAlumnoAsignaturas() {
		// TODO Auto-generated method stub
		//Obtengo el resultado a través del repositorio
		List<AlumnoAsignatura> alumAsigBD = alumAsigRepo.findAll();		
		
		
		//Verificando que he obtenido algo 
		if (alumAsigBD!= null && alumAsigBD.size()> 0) {
			
			return alumAsigBD;
		}
		
		//No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<AlumnoAsignatura>(); 
	}

	@Override
	public AlumnoAsignatura insertarAlumnoAsignatura(AlumnoAsignatura alumnoAsignatura) {
		// TODO Auto-generated method stub
		return null;
	}





}
