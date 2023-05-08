package ar.edu.uade.adoo.ejercicios.clase7;

public class Disponible implements IEstado{
    @Override
    public void concretar(Empleado empleado, Cliente cliente, Operacion operacion) {

    }

    @Override
    public void reservar(Empleado empleado, Cliente cliente, Operacion operacion) {
        operacion.setEstado(new Reservado(cliente));
        operacion.setEmpleadoReserva(empleado);
        empleado.agregarReserva();
    }
}
