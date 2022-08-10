package org.iesalixar.servidor.services;

import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.model.AlumnoAsignatura;
import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;

public interface AlumnoAsignaturaService {
	public void deleteAlumnoAsignaturaById(AlumnoAsignatura alumnoAsignatura);
	public AlumnoAsignatura actualizarAlumnoAsignaturas(AlumnoAsignatura alumnoAsignatura);
	public List<AlumnoAsignatura> getAllAlumnoAsignaturas();
	public AlumnoAsignatura insertarAlumnoAsignatura(AlumnoAsignatura alumnoAsignatura);
	public AlumnoAsignatura findAlumnoAsignaturaById(Alumno id, Asignatura id1);
}
