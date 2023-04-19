package Package;

public class Administrativo extends Trabajador {
	private String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Administrativo(String nombre, String estadoCivil, String direccion, String horarioTrabajo, String rut, String tituloProf, String email) {
		super(nombre, estadoCivil, direccion, horarioTrabajo, rut, tituloProf);
		this.email = email;
	}
	public String getTipo() {
		return "Administrativo";
	}
	public String toString() {
		return this.getNombre() + ", " + this.getTipo();
	}
}