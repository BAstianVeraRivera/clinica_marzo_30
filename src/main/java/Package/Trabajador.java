package Package;

public abstract class Trabajador {
	private String nombre;
	private String estadoCivil;
	private String direccion;
	private String horarioTrabajo;
	private String rut;
	private String tituloProf;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarioTrabajo() {
		return this.horarioTrabajo;
	}

	public void setHorarioTrabajo(String horarioTrabajo) {
		this.horarioTrabajo = horarioTrabajo;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getTituloProf() {
		return this.tituloProf;
	}

	public void setTituloProf(String tituloProf) {
		this.tituloProf = tituloProf;
	}

	public Trabajador(String nombre, String estadoCivil, String direccion, String horarioTrabajo, String rut, String tituloProf) {
		this.nombre = nombre;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.horarioTrabajo = horarioTrabajo;
		this.rut = rut;
		this.tituloProf = tituloProf;
	}
	public abstract String getTipo();
}