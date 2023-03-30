package Package;

public class Medico extends Trabajador {
	private String pacienteAsignados;
	private String horarioAtencion;
	private String especializacion;
	private String tieneExperiencia;

	public String getPacienteAsignados() {
		return this.pacienteAsignados;
	}

	public void setPacienteAsignados(String pacienteAsignados) {
		this.pacienteAsignados = pacienteAsignados;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getEspecializacion() {
		return this.especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getTieneExperiencia() {
		return this.tieneExperiencia;
	}

	public void setTieneExperiencia(String tieneExperiencia) {
		this.tieneExperiencia = tieneExperiencia;
	}

	public Medico(String nombre, String estadoCivil, String direccion, String horarioTrabajo, String rut, String tituloProf, String pacienteAsignados, String horarioAtencion, String especializacion, String tieneExperiencia) {
		super(nombre, estadoCivil, direccion, horarioTrabajo, rut, tituloProf);
		this.pacienteAsignados = pacienteAsignados;
		this.horarioAtencion = horarioAtencion;
		this.especializacion = especializacion;
		this.tieneExperiencia = tieneExperiencia;
	}
	public String getTipo() {
		return "Medico";
	}
}