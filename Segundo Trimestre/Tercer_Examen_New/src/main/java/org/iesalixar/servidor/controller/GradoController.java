package org.iesalixar.servidor.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.dto.AlumnoAsignaturaDTO;
import org.iesalixar.servidor.dto.AlumnoAsignaturaNotaDTO;
import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.model.AlumnoAsignatura;
import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.services.AlumnoAsignaturaServiceImpl;
import org.iesalixar.servidor.services.AlumnoServiceImpl;
import org.iesalixar.servidor.services.AsignaturaServiceImpl;
import org.iesalixar.servidor.services.GradoServiceImpl;
import org.iesalixar.servidor.services.ProfesorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class GradoController {

	@Autowired
	GradoServiceImpl gradoService;

	@Autowired
	AsignaturaServiceImpl asignaturaService;

	@Autowired
	AlumnoServiceImpl alumnoService;

	@Autowired
	AlumnoAsignaturaServiceImpl alumnoAsignaturaService;

	@Autowired
	ProfesorServiceImpl profesorService;

	
	@GetMapping("/")
	public String asignaturas(Model model) {

		List<Asignatura> asignaturas = asignaturaService.getAllAsignaturas();

		model.addAttribute("asignaturas", asignaturas);
		return "index";
	}
	
	
	@RequestMapping("/matriculas/add")
	public String addMatriculaGet(@RequestParam(required = false, name = "error") String error,@RequestParam(required = false, name = "codigo") String codigo, Model model) {
		
	
		AlumnoAsignaturaNotaDTO matricula = new AlumnoAsignaturaNotaDTO();
		Optional<Asignatura> asignatura = asignaturaService.findAsignaturaById(Long.parseLong(codigo));
		List<Alumno> alumnos = alumnoService.getAllAlumnos();

		
		model.addAttribute("matricula", matricula);
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("asignatura", asignatura);
		model.addAttribute("error", error);
		return "addMatricula";
	}
	
	@PostMapping("/matriculas/add")
	public String addMatriculaPost( @ModelAttribute AlumnoAsignaturaNotaDTO alumAsig, Model model) throws ParseException {

		AlumnoAsignatura alumnoAsignaturaBD = new AlumnoAsignatura();
		Optional<Alumno> alumno = alumnoService.findAlumnoById(alumAsig.getId_alumno());
		Optional<Asignatura> asignatura = asignaturaService.findAsignaturaById(alumAsig.getId_asignatura());

		
		alumnoAsignaturaBD.setAlumno(alumno.get());
		alumnoAsignaturaBD.setAsignatura(asignatura.get());
		alumnoAsignaturaBD.setNota(alumAsig.getNota());
		
		alumnoAsignaturaService.actualizarAlumnoAsignaturas(alumnoAsignaturaBD);

		return "redirect:/";
	}
	


	
	@GetMapping("/matriculas/list")
	public String asignaturasGrado(@RequestParam(required = false, name = "codigo") String codigo, Model model) {


		if (codigo == null) {
			return "redirect:/";
		}
		
		
		Optional<Asignatura> asignatura = asignaturaService.findAsignaturaById(Long.parseLong(codigo));
		model.addAttribute("asignatura",asignatura.get());		
		model.addAttribute("matriculados",asignatura.get().getAlumnosAsignatura());		
		return "listMatricula";
	}
	
	
	@RequestMapping("/matriculas/delete")
	public String gradosDelete(@RequestParam(required = false, name = "error") String error, @RequestParam(required = false, name = "alum") String alum,@RequestParam(required = false, name = "asig") String asig, Model model) {
		
		Optional<Alumno> alumno = alumnoService.findAlumnoById(Long.parseLong(alum));
		Optional<Asignatura> asignatura = asignaturaService.findAsignaturaById(Long.parseLong(asig));

		asignatura.get().removeNota(alumno.get());
		
		model.addAttribute("error", error);


		return "redirect:/";
	}
	
	@GetMapping("/matriculas/report")
	public String matriculasReport(@RequestParam(required = false, name = "codigo") String codigo, Model model) {

		Optional<Asignatura> asignatura = asignaturaService.findAsignaturaById(Long.parseLong(codigo));

		int aprobados = 0;
		int suspensos = 0;
		
		
		for (AlumnoAsignatura aa  : asignatura.get().getAlumnosAsignatura()) {
			if(aa.getNota() >=5) {
				aprobados++;
			}else {
				suspensos++;
			}
		}
		
		
		model.addAttribute("asignatura",asignatura.get());		
		model.addAttribute("aprobados", aprobados);		
		model.addAttribute("suspensos", suspensos);		
		model.addAttribute("matriculados",asignatura.get().getAlumnosAsignatura());		

		
		return "reportMatricula";
	}
	
	
	

}
