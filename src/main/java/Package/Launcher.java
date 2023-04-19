package Package;
import java.util.ArrayList;
public class Launcher {
    public static void main(String[] args) {
        comenzar();
    }

    public static void inicializar() {
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Administrativo> administrativos = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        ArrayList<Trabajador> pediatria = new ArrayList<>();
        ArrayList<Trabajador> traumatologia = new ArrayList<>();
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        Clinica techy = new Clinica("Clinica techy", "Av. San Martín 1293, Temuco, Araucanía", "Privada", trabajadores, especialidades);
        Medico medico1 = new Medico("diego", "soltero", "quepe", "8-18", "12345678-0", "medico", "juan", "1-2", "pediatria", "si");
        Medico medico2 = new Medico("camilo", "casado", "temuco", "8-17", "87654321-9", "medico", "pedro", "2-3", "traumatologia", "si");
        Administrativo administrativo1 = new Administrativo("bastian", "soltero", "victoria", "9-15", "18273645-6", "asistente social", "bastian@gmail.com");
        Administrativo administrativo2 = new Administrativo("alejandra", "soltero", "santiago", "9-15", "37467267-2", "abogado", "alejandra@gmail.com");
        pediatria.add(administrativo1);
        traumatologia.add(administrativo2);
        techy.obtenerMedicosPorEspecialidad("pediatria");
    }

    public static void comenzar() {
        ArrayList<Medico> medicos;
        ArrayList<Administrativo> administrativos;
        ArrayList<Medico> medicosPorEspecialidad;
        ArrayList<Medico> medicos2 = new ArrayList<>();
        ArrayList<Administrativo> administrativos2 = new ArrayList<>();
        ArrayList<Medico> medicos1 = new ArrayList<>();
        ArrayList<Administrativo> administrativos1 = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        Medico medico1 = new Medico("Medico", "Diego", "quepe", "soltero", "12345678-0", "8-18", "pediatria", "1-2", "juan", "si");
        Medico medico2 = new Medico("Medico", "Camilo", "temuco", "casado", "87654321-9", "8-17", "traumatologia", "2-3", "pedro", "si");
        trabajadores.add(medico1);
        trabajadores.add(medico2);
        Administrativo administrativo1 = new Administrativo("asistente social", "Bastian", "victoria", "soltero", "18273645-6", "9-15", "bastian@gmail.com");
        Administrativo administrativo2 = new Administrativo("abogado", "Alejandra", "santiago", "soltero", "37467267-2", "9-15", "alejandra@gmail.com");
        trabajadores.add(administrativo1);
        trabajadores.add(administrativo2);
        Especialidad especialidad1 = new Especialidad("pediatria", "71.1932", administrativos1, medicos1);
        Especialidad especialidad2 = new Especialidad("traumatologia", "18.7101", administrativos2, medicos2);
        especialidades.add(especialidad1);
        especialidades.add(especialidad2);
        medicos1.add(medico1);
        medicos2.add(medico2);
        administrativos1.add(administrativo1);
        administrativos2.add(administrativo2);
        Clinica techy = new Clinica("Clinica techy", "Av. San Martín 1293, Temuco, Araucanía", "Privada", trabajadores, especialidades);

        medicosPorEspecialidad = techy.obtenerMedicosPorEspecialidad("pediatria");
        for (Medico medico : medicosPorEspecialidad) {
            System.out.println(medico.toString());
        }
    }
}
