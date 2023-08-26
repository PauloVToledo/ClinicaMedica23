package org.example.clinicaMedica;

public class Medico extends Trabajador {
	private String nombre;
	private String especializacion;
	private String horarioAtencion;
	private int pacientesAsignados;
	private String experiencia;
	public EspecialidadMedica especialidadMedica;

	public String getNombre() {
		return this.nombre;
	}

	public String getEspecializacion() {
		return this.especializacion;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public int getPacientesAsignados() {
		return this.pacientesAsignados;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public Medico(String nombre, String especializacion, String horarioAtencion, int pacientesAsignados, String experiencia) {
		super(nombre, especializacion, horarioAtencion, String.valueOf(pacientesAsignados), experiencia);
		this.nombre = nombre;
		this.especializacion = especializacion;
		this.horarioAtencion = horarioAtencion;
		this.pacientesAsignados = pacientesAsignados;
		this.experiencia = experiencia;
	}
}
