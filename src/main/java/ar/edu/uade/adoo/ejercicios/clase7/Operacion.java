package ar.edu.uade.adoo.ejercicios.clase7;

public abstract class Operacion {
    private IEstado estado;
    private Inmueble inmueble;
    private Cliente cliente;

    private Empleado empleadoReserva;
    private Empleado empleadoFinal;

    public Operacion(Inmueble inmueble) {
        this.inmueble = inmueble;
        this.estado = new Disponible();
    }

    public abstract Double calcularComision();

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleadoReserva(Empleado empleadoReserva) {
        this.empleadoReserva = empleadoReserva;
    }

    public void setEmpleadoFinal(Empleado empleadoFinal) {
        this.empleadoFinal = empleadoFinal;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void reservar(Empleado empleado, Cliente cliente) {
        this.estado.reservar(empleado, cliente, this);
    }

    public void concretar(Empleado empleado, Cliente cliente) {
        this.estado.concretar(empleado, cliente, this);
    }

    public Boolean sonLosEmpleadosDistintos() {
        return this.empleadoReserva.equals(this.empleadoFinal);
    }
}
