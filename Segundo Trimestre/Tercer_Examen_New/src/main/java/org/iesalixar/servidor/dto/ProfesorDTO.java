package org.iesalixar.servidor.dto;

import java.util.Objects;

public class ProfesorDTO {

	private Long id;
	private String nif;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String fecha_nacimiento;
	private String sexo;
	private int id_departamento;
	
	public ProfesorDTO(Long id, String nif, String nombre, String apellido1, String apellido2, String ciudad,
			String direccion, String telefono, String fecha_nacimiento, String sexo, int id_departamento) {
		super();
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.id_departamento = id_departamento;
	}

	public ProfesorDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido1, apellido2, ciudad, direccion, fecha_nacimiento, id, id_departamento, nif, nombre,
				sexo, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfesorDTO other = (ProfesorDTO) obj;
		return Objects.equals(apellido1, other.apellido1) && Objects.equals(apellido2, other.apellido2)
				&& Objects.equals(ciudad, other.ciudad) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(fecha_nacimiento, other.fecha_nacimiento) && Objects.equals(id, other.id)
				&& id_departamento == other.id_departamento && Objects.equals(nif, other.nif)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(sexo, other.sexo)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", ciudad=" + ciudad + ", direccion=" + direccion + ", telefono="
				+ telefono + ", fecha_nacimiento=" + fecha_nacimiento + ", sexo=" + sexo + ", id_departamento="
				+ id_departamento + "]";
	}
	
	
}
