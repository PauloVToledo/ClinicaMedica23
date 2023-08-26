package org.example.clinicaMedica;

public abstract class Trabajador {
	protected String tituloProfesional;
	protected String direccion;
	protected String estadoCivil;
	protected String rut;
	protected String horarioTrabajo;

	public Trabajador(String correoElectronico) {

	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getHorarioTrabajo() {
		return this.horarioTrabajo;
	}

	public void setHorarioTrabajo(String horarioTrabajo) {
		this.horarioTrabajo = horarioTrabajo;
	}

	public abstract String getTipo();

	public Trabajador(String tituloProfesional, String direccion, String estadoCivil, String rut, String horarioTrabajo) {
		this.tituloProfesional = tituloProfesional;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horarioTrabajo = horarioTrabajo;
		throw new UnsupportedOperationException();
	}

	public void setEspecialidadMedica(EspecialidadMedica especialidadMedica) {
	}

	public void setExperiencia(String experiencia) {
	}

	public EspecialidadMedica getEspecialidadMedica() {
		return null;
	}
}
