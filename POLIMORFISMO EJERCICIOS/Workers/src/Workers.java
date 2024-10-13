import java.util.ArrayList;

class Empleado {
    protected String nombre;
    protected String apellidos;
    protected int cedula;
    protected String direccion;
    protected int antiguedad;
    protected String telefono;
    protected double salario;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, int cedula, String direccion, int antiguedad, String telefono, double salario, Empleado supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = supervisor;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("cedula: " + cedula);
        System.out.println("Dirección: " + direccion);
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.nombre + " " + supervisor.apellidos);
        } else {
            System.out.println("No tiene supervisor");
        }
    }

    public void cambiarSupervisor(Empleado nuevoSupervisor) {
        this.supervisor = nuevoSupervisor;
        System.out.println(nombre + " su nuevo supervisor es: " + nuevoSupervisor.nombre);
    }

    public void incrementarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
        System.out.println(nombre + " ha recibido un incremento del " + porcentaje + "%. Nuevo salario: " + salario);
    }
}

class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellidos, int cedula, String direccion, int antiguedad, String telefono, double salario, Empleado supervisor, String despacho, String numeroFax) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono, salario, supervisor);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Número de Fax: " + numeroFax);
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(5);
    }
}

class Vendedor extends Empleado {
    private String placa;
    private String marca;
    private String modelo;
    private String telefonoMovil;
    private String areaVenta;
    private ArrayList<String> listaClientes;
    private double porcentajeComision;

    public Vendedor(String nombre, String apellidos, int cedula, String direccion, int antiguedad, String telefono, double salario, Empleado supervisor, String placa, String marca, String modelo, String telefonoMovil, String areaVenta, double porcentajeComision) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono, salario, supervisor);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<>();
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Coche: " + marca + " " + modelo + " (" + placa + ")");
        System.out.println("Teléfono móvil: " + telefonoMovil);
        System.out.println("Área de venta: " + areaVenta);
        System.out.println("Clientes: " + listaClientes);
        System.out.println("Porcentaje de comisión: " + porcentajeComision + "%");
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(10);
    }

    public void darAltaCliente(String cliente) {
        listaClientes.add(cliente);
        System.out.println("Cliente " + cliente + " ha sido dado de alta.");
    }

    public void darBajaCliente(String cliente) {
        if (listaClientes.remove(cliente)) {
            System.out.println("Cliente " + cliente + " ha sido dado de baja.");
        } else {
            System.out.println("Cliente " + cliente + " no encontrado.");
        }
    }

    public void cambiarCoche(String matricula, String marca, String modelo) {
        this.placa = matricula;
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Coche cambiado a: " + marca + " " + modelo + " (" + matricula + ")");
    }
}

class JefeDeZona extends Empleado {
    private String despacho;
    private String coche;
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;

    public JefeDeZona(String nombre, String apellidos, int cedula, String direccion, int antiguedad, String telefono, double salario, Empleado supervisor, String despacho, String coche, Secretario secretario) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono, salario, supervisor);
        this.despacho = despacho;
        this.coche = coche;
        this.secretario = secretario;
        this.vendedores = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Coche: " + coche);
        System.out.println("Secretario: " + secretario.nombre + " " + secretario.apellidos);
        System.out.println("Vendedores a cargo:");
        for (Vendedor vendedor : vendedores) {
            System.out.println("- " + vendedor.nombre + " " + vendedor.apellidos);
        }
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(20);
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
        System.out.println("Nuevo secretario asignado: " + nuevoSecretario.nombre + " " + nuevoSecretario.apellidos);
    }

    public void cambiarCoche(String nuevoCoche) {
        this.coche = nuevoCoche;
        System.out.println("El coche del jefe de zona cambio a: " + nuevoCoche);
    }

    public void darAltaVendedor(Vendedor nuevoVendedor) {
        vendedores.add(nuevoVendedor);
        System.out.println("Vendedor " + nuevoVendedor.nombre + " " + nuevoVendedor.apellidos + " ha sido dado de alta en la zona.");
    }

    public void darBajaVendedor(Vendedor vendedor) {
        if (vendedores.remove(vendedor)) {
            System.out.println("Vendedor " + vendedor.nombre + " " + vendedor.apellidos + " ha sido dado de baja de la zona.");
        } else {
            System.out.println("Vendedor no encontrado en la zona.");
        }
    }
}

public class Workers {
    public static void main(String[] args) {
        Empleado supervisor = new Empleado("Mauricio", "Tuniz", 87415668, "San Francisco de Estero cll 17 78-10", 10, "3209548732", 50000, null);
        Secretario secretario = new Secretario("Paul", "Johnson", 87653212, "Calle Pilares manzana 789", 7, "3659897426", 25000, supervisor, "Despacho 1", "1234");

        Vendedor vendedor1 = new Vendedor("San Cristobal", "Colon", 87654321, "Calle moldavia manzana 456", 5, "3942503168", 30000, supervisor, "1234-ABC", "Toyota", "Corolla", "3942503168", "Norte", 10);
        Vendedor vendedor2 = new Vendedor("Milica", "Williams", 19283746, "Polaris 15 manzana 789", 3, "31862045890", 28000, supervisor, "5678-DEF", "Honda", "Civic", "31862045890", "Sur", 8);

        JefeDeZona jefe = new JefeDeZona("Alice", "Muñoz", 1928374, "Mauritania solar Calle  987", 15, "3205689452", 70000, supervisor, "Despacho 2", "Tesla Model S", secretario);

        System.out.println("Dar de alta un nuevo cliente.");
        System.out.println();
        vendedor1.darAltaCliente("Carlos García");
        vendedor1.darAltaCliente("María Pérez");
        System.out.println();

        System.out.println("Empleados");
        System.out.println();
        System.out.println("Vendedor 1");
        vendedor1.imprimir();
        System.out.println();
        System.out.println("Vendedor 2");
        vendedor2.imprimir();
        System.out.println();
        System.out.println("Secretario");
        secretario.imprimir();
        System.out.println();
        System.out.println("Jefe de Zona");
        jefe.imprimir();
        System.out.println();

        System.out.println("Incremento salarial.");
        System.out.println();
        vendedor1.incrementarSalario(0);
        vendedor2.incrementarSalario(0);
        secretario.incrementarSalario(0);
        jefe.incrementarSalario(0);
        System.out.println();

        System.out.println("Dar de baja un cliente.");
        vendedor1.darBajaCliente("Carlos García");
        System.out.println();
        vendedor1.imprimir();
        System.out.println();

        System.err.println("Vendedor cambia de coche.");
        vendedor1.cambiarCoche("ABC-123", "Tesla", "Y");
        System.err.println("");
        vendedor1.imprimir();
        System.err.println("");

        System.out.println("Cambiar supervisor.");
        vendedor1.cambiarSupervisor(jefe);
        System.out.println();

        System.out.println("Cambiar coche del jefe de zona.");
        jefe.cambiarCoche("Audi A8");

        System.out.println("Dar de alta un vendedor.");
        jefe.darAltaVendedor(vendedor2);
        System.out.println();
        
        System.out.println("Dar de baja un vendedor.");
        jefe.darBajaVendedor(vendedor2);
        System.out.println();

        Secretario nuevoSecretario = new Secretario("Sofia", "Silva", 887947879, "Maridiaz 34 calle 10 78 manzana 89", 0, "3452017654", 25000, supervisor, "Despacho 1", "3654");

        System.out.println("Cambiar Secretario.");
        jefe.cambiarSecretario(nuevoSecretario);

        System.out.println("Empleados");
        System.out.println();
        System.out.println("Vendedor 1");
        vendedor1.imprimir();
        System.out.println();
        System.out.println("Vendedor 2");
        vendedor2.imprimir();
        System.out.println();
        System.out.println("Secretario");
        nuevoSecretario.imprimir();
        System.out.println();
        System.out.println("Jefe de Zona");
        jefe.imprimir();
        System.out.println();
        


    }
}
