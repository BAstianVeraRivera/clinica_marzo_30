package Package;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
	private String nombreClinica;
	private String direccionesAsociadas;
	private String tipoDeClinica;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();

	public String getNombreClinica() {
		return this.nombreClinica;
	}

	public void setNombreClinica(String nombreClinica) {
		this.nombreClinica = nombreClinica;
	}

	public String getDireccionesAsociadas() {
		return this.direccionesAsociadas;
	}

	public void setDireccionesAsociadas(String direccionesAsociadas) {
		this.direccionesAsociadas = direccionesAsociadas;
	}

	public String getTipoDeClinica() {
		return this.tipoDeClinica;
	}

	public void setTipoDeClinica(String tipoDeClinica) {
		this.tipoDeClinica = tipoDeClinica;
	}

	public Clinica(String nombreClinica, String direccionesAsociadas, String tipoDeClinica, ArrayList<Trabajador> trabajadores, ArrayList<Especialidad> especialidades) {
		this.nombreClinica = nombreClinica;
		this.direccionesAsociadas = direccionesAsociadas;
		this.tipoDeClinica = tipoDeClinica;
		this.trabajadores = trabajadores;
		this.especialidades = especialidades;
	}
	public ArrayList<Medico> obtenerMedicos(){
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Medico")){
				medicos.add((Medico) trabajador);
				System.out.println(medicos);
			}
		}
		return medicos;
	}
	public ArrayList<Administrativo> obtenerAdmin(){
		ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Administrativo")){
				administrativos.add((Administrativo) trabajador);
				System.out.println(administrativos);
			}
		}
		return administrativos;
	}
	public ArrayList<Medico> obtenerMedicosPorEspecialidad(String nombreEspecialidad){
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		for(Especialidad especialidad : this.especialidades){
			if(especialidad.getNombreEspecialidad().equals(nombreEspecialidad)){
				for(Trabajador trabajador : this.trabajadores){
					if(trabajador.getTipo().equals("Medico")){
						medicos.add((Medico) trabajador);
					}
				}
			}
		}
		return medicos;
	}
	public ArrayList<Administrativo> obtenerAdminiPorEspecialidad(String nombreBuscado){
		ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
		for(Especialidad especialidad : this.especialidades){
			if(especialidad.getNombreEspecialidad().equals(nombreBuscado)){
				for(Trabajador trabajador : this.trabajadores){
					if(trabajador.getTipo().equals("Administrativo")){
						administrativos.add((Administrativo) trabajador);
					}
				}
			}
		}
		return administrativos;
	}
	public ArrayList<Administrativo> obtenerAdminPorRut(String rutBuscado){
		ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getRut().equals(rutBuscado)){
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}

}