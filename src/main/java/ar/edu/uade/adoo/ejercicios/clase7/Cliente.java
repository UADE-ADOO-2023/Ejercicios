package ar.edu.uade.adoo.ejercicios.clase7;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private Integer dni;

    public Cliente(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
