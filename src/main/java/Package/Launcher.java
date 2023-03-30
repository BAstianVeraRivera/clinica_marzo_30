package Package;
import java.util.ArrayList;
public class Launcher {
    public static void main(String [] args) {
        inicializar();
    }
    public static void inicializar() {
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Administrativo> administrativos = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        Medico medico1 = new Medico("diego","soltero","quepe","8-18","12345678-0","medico","juan","1-2","pediatria","si");
        Medico medico2 = new Medico("camilo","casado","temuco","8-17","87654321-9","medico","pedro","2-3","traumatologia","si");
        Administrativo administrativo1 = new Administrativo("bastian","soltero","victoria","9-15","18273645-6","asistente social","bastian@gmail.com");
        Administrativo administrativo2 = new Administrativo("alejandra","soltero","santiago","9-15","37467267-2","abogado","alejandra@gmail.com");
        Especialidad especialidad1 = new Especialidad("pediatria","las condes", administrativos,medicos);
        Especialidad especialidad2 = new Especialidad("traumatologia","providencia",administrativos,medicos);
        Clinica CLINICA = new Clinica("Clinica techy", "Av. San Martín 1293, Temuco, Araucanía","Privada",trabajadores,especialidades );
        medicos.add(medico1);
        medicos.add(medico2);
        administrativos.add(administrativo1);
        administrativos.add(administrativo2);
        trabajadores.add(medico1);
        trabajadores.add(medico2);
        trabajadores.add(administrativo1);
        trabajadores.add(administrativo2);
        especialidades.add(especialidad1);
        especialidades.add(especialidad2);
    }
}
