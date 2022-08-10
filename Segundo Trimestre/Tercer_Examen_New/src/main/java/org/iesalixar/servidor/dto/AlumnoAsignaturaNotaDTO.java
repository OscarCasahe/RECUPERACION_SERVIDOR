package org.iesalixar.servidor.dto;

import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.model.Asignatura;

public class AlumnoAsignaturaNotaDTO {
	private Long id_alumno;
	private Long id_asignatura;
	private int nota;
	
	public AlumnoAsignaturaNotaDTO() {
	}

	public Long getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Long id_alumno) {
		this.id_alumno = id_alumno;
	}

	public Long getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}


	
}
