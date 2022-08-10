package org.iesalixar.servidor.services;

import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Alumno;

public interface AlumnoService {
	public Optional<Alumno> findAlumnoById(Long id);
	public void deleteAlumnoById(Long id);
	public Alumno actualizarAlumno(Alumno alumno);
	public List<Alumno> getAllAlumnos();
	public Alumno insertarAlumno(Alumno alumno);
	public Optional<Alumno> findAlumnoByNif(String nif);
}
