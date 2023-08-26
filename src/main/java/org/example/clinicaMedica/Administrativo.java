package org.example.clinicaMedica;

public class Administrativo extends Trabajador {
	private String correoElectronico;
	EspecialidadMedica especialidadMedica;

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public Administrativo(String correoElectronico) {
		super(correoElectronico);
		this.correoElectronico=correoElectronico;
	}
}