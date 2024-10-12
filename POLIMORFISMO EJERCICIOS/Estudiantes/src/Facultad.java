// Clase base Persona
class Persona {
    private String nombre;
    private String apellidos;
    private String id;
    private String estadoCivil;

    public Persona(String nombre, String apellidos, String id, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidos + ", ID: " + id + ", Estado civil: " + estadoCivil;
    }
}

class Empleado extends Persona {
    private int yearIncorporacion;
    private int despacho;

    public Empleado(String nombre, String apellidos, String id, String estadoCivil, int yearIncorporacion, int despacho) {
        super(nombre, apellidos, id, estadoCivil);
        this.yearIncorporacion = yearIncorporacion;
        this.despacho = despacho;
    }

    public void reasignarDespacho(int nuevoDespacho) {
        this.despacho = nuevoDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Año incorporación: " + yearIncorporacion + ", Despacho: " + despacho;
    }
}

class Estudiante extends Persona {
    private int curso;

    public Estudiante(String nombre, String apellidos, String id, String estadoCivil, int curso) {
        super(nombre, apellidos, id, estadoCivil);
        this.curso = curso;
    }

    public void matricularEnNuevoCurso(int nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso;
    }
}

class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String id, String estadoCivil, int yearIncorporacion, int despacho, String departamento) {
        super(nombre, apellidos, id, estadoCivil, yearIncorporacion, despacho);
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}

class PersonalDeServicio extends Empleado {
    private String seccion;

    public PersonalDeServicio(String nombre, String apellidos, String id, String estadoCivil, int yearIncorporacion, int despacho, String seccion) {
        super(nombre, apellidos, id, estadoCivil, yearIncorporacion, despacho);
        this.seccion = seccion;
    }

    public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seccion: " + seccion;
    }
}

public class Facultad {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Miguel", "Rualez", "7262788", "Soltero", 2);
        Profesor profesor = new Profesor("Ana", "Victoria Yepes", "88945612389", "Casada", 2018, 101, "Matematicas");
        PersonalDeServicio personal = new PersonalDeServicio("Luis", "Diaz", "50736745", "Divorciado", 2020, 202, "Biblioteca");

        System.out.println("Información inicial:");
        System.out.println(estudiante);
        System.out.println(profesor);
        System.out.println(personal);
        System.err.println("");

        estudiante.cambiarEstadoCivil("Casado");
        estudiante.matricularEnNuevoCurso(3);
        profesor.cambiarDepartamento("Ingenieria de Software");
        profesor.reasignarDespacho(501);
        personal.cambiarSeccion("Decanato");
        personal.reasignarDespacho(203);

        System.out.println("\nInformación actualizada:");
        System.out.println(estudiante);
        System.out.println(profesor);
        System.out.println(personal);
    }
}
