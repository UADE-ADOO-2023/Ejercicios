package ar.edu.uade.adoo.ejercicios.clase7;

public class Reservado implements IEstado {
    private Cliente clienteReserva;

    public Reservado(Cliente clienteReserva) {
        this.clienteReserva = clienteReserva;
    }

    @Override
    public void concretar(Empleado empleado, Cliente cliente, Operacion operacion) {
        if (cliente.equals(this.clienteReserva)) {
            operacion.setEstado(new Concretado());
            operacion.setCliente(cliente);
            operacion.setEmpleadoFinal(empleado);
            empleado.agregarComision(operacion.getInmueble().calcularValor());
            empleado.agregarOperacionConcretada();
        }
    }

    @Override
    public void reservar(Empleado empleado, Cliente cliente, Operacion operacion) {

    }
}
