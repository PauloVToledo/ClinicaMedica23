package org.example.clinicaMedica;

import java.util.ArrayList;

public class EspecialidadMedica {
	private String nombre;
	private double latitud;
	private double longitud;
	private Clinica clinica;
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Medico> medicos = new ArrayList<Medico>();

	public String getNombre() {
		return this.nombre;
	}

	public double getLatitud() {
		return this.latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}

	public Medico agregarMedico(Medico medico, String experiencia) {
		if (experienciaValida(experiencia)) {
			medicos.add(medico);
			medico.setExperiencia(experiencia);
			medico.setEspecialidadMedica(this);
			return medico;
		} else {
			throw new IllegalArgumentException("Experiencia inválida");
		}
	}

	private boolean experienciaValida(String experiencia) {
		return experiencia.equals("cirugía") || experiencia.equals("medicina interna") || experiencia.equals("pediatría");
	}

	public Administrativo agregarAdministrativo(Administrativo administrativo) {
		administrativos.add(administrativo);
		administrativo.especialidadMedica = this;
		return administrativo;
	}

	public EspecialidadMedica(String nombre, double latitud, double longitud) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}


}
