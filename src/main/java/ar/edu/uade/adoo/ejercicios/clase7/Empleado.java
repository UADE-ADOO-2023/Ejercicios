package ar.edu.uade.adoo.ejercicios.clase7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empleado {
    private String nombre;
    private List<Double> comisiones;
    private Integer operacionesConcretadas;
    private Integer reservasConcretadas;


    public Empleado(String nombre) {
        this.nombre = nombre;
        this.comisiones = new ArrayList<>();
        this.operacionesConcretadas = 0;
        this.reservasConcretadas = 0;
    }

    public void agregarComision(Double comision) {
        this.comisiones.add(comision);
    }

    public void agregarOperacionConcretada() {
        this.operacionesConcretadas++;
    }

    public void agregarReserva() {
        this.reservasConcretadas++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
