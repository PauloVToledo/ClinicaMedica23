package org.example.clinicaMedica;

import java.util.ArrayList;

public class Clinica {
	private String nombre;
	private String direccion;
	private boolean esClinicaPrivada;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	public ArrayList<EspecialidadMedica> tiene = new ArrayList<EspecialidadMedica>();

	public boolean esClinicaPrivada() {
		return esClinicaPrivada;
	}

	public ArrayList<Medico> obtenerMedicos() {
		ArrayList<Medico> medicosClinica = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Medico) {
				medicosClinica.add((Medico) trabajador);
			}
		}
		return medicosClinica;
	}

	public ArrayList<Administrativo> obtenerAdministrativos() {
		ArrayList<Administrativo> administrativosClinica = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador instanceof Administrativo) {
				administrativosClinica.add((Administrativo) trabajador);
			}
		}
		return administrativosClinica;
	}

	public ArrayList<Administrativo> obtenerAdministrativosEspecialidad(String nombreEspecialidad) {
		ArrayList<Administrativo> administrativosEspecialidad = new ArrayList<>();
		for (Administrativo administrativo : obtenerAdministrativos()) {
			if (administrativo.getEspecialidadMedica().getNombre().equals(nombreEspecialidad)) {
				administrativosEspecialidad.add(administrativo);
			}
		}
		return administrativosEspecialidad;
	}

	public ArrayList<Medico> obtenerMedicosEspecialidad(String nombreEspecialidad) {
		ArrayList<Medico> medicosEspecialidad = new ArrayList<>();
		for (Medico medico : obtenerMedicos()) {
			if (medico.getEspecialidadMedica().getNombre().equals(nombreEspecialidad)) {
				medicosEspecialidad.add(medico);
			}
		}
		return medicosEspecialidad;
	}
}
