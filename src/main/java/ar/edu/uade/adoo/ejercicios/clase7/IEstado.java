package ar.edu.uade.adoo.ejercicios.clase7;

public interface IEstado {
    void concretar(Empleado empleado, Cliente cliente, Operacion operacion);
    void reservar(Empleado empleado, Cliente cliente, Operacion operacion);
}
