class Vehiculo {
    private String placa;
    private int velocidad;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.velocidad = 0;
    }

    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public String getplaca() {
        return placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "placa: " + placa + ", Velocidad: " + velocidad + " km/h";
    }
}

class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String placa, int numeroPuertas) {
        super(placa);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de puertas: " + numeroPuertas;
    }
}

class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String placa) {
        super(placa);
        this.remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int incremento) {
        if (remolque != null && getVelocidad() + incremento > 100) {
            System.out.println("El camion va demasiado rápido con el remolque!");
        } else {
            super.acelerar(incremento);
        }
    }

    @Override
    public String toString() {
        String info = super.toString();
        if (remolque != null) {
            info += ", " + remolque.toString();
        }
        return info;
    }
}

class Remolque {
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "El remolque pesa: " + peso + " kg";
    }
}


public class SimuladorVehiculos {
    public static void main(String[] args) {
        System.err.println("Coche");
        Coche coche = new Coche("ABC-123", 4);
        coche.acelerar(50);
        System.out.println(coche);
        System.err.println("");

        System.err.println("Camion: ");
        Camion camion = new Camion("FRU-482");
        camion.acelerar(60);
        System.out.println(camion);
        System.err.println("");

        System.err.println("- remolque");
        Remolque remolque = new Remolque(1500);
        camion.ponRemolque(remolque);
        camion.acelerar(50);
        System.out.println(camion);
        System.err.println("");

        camion.acelerar(50);
        System.out.println(camion);
        System.err.println("");
    }
}
