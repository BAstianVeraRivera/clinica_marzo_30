package Package;
import java.util.ArrayList;
public class Especialidad {
	private String nombreEspecialidad;
	private String ubicacion;
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	public ArrayList<Medico> getMedicos() {
		return medicos;
	}
	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}

	public String getNombreEspecialidad() {
		return this.nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Especialidad(String nombreEspecialidad, String ubicacion, ArrayList<Administrativo> administrativos, ArrayList<Medico> medicos) {
		this.nombreEspecialidad = nombreEspecialidad;
		this.ubicacion = ubicacion;
		this.administrativos = administrativos;
		this.medicos = medicos;
	}
}