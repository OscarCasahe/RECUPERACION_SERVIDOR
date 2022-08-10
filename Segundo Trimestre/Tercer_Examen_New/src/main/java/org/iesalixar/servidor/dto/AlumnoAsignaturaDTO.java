package org.iesalixar.servidor.dto;

import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.model.Asignatura;

public class AlumnoAsignaturaDTO {
	private Alumno alumno;
	private Asignatura asignatura;
	private int nota;
	
	public AlumnoAsignaturaDTO() {
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
