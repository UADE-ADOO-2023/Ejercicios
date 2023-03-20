package ar.edu.uade.adoo.ejercicios.clases1;

import ar.edu.uade.adoo.ejercicios.clase1.CajaAhorro;
import ar.edu.uade.adoo.ejercicios.clase1.Cliente;
import ar.edu.uade.adoo.ejercicios.clase1.CuentaCorriente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Ejercicio1Test {
    @Test
    public void extraccionTest() {
        Cliente cliente = new Cliente("Ana", "Martinez", 123456789);
        CajaAhorro cajaAhorro = new CajaAhorro(cliente, 0D, 1234);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente, 0D, 6789);

        assertEquals(0D, cajaAhorro.getBalance(), 0);
        assertEquals(0D, cuentaCorriente.getBalance(), 0);

        cajaAhorro.depositar(10000D);
        cuentaCorriente.depositar(1000D);

        assertEquals(10000D, cajaAhorro.getBalance(), 0);

        cuentaCorriente.extraer(2000D);

        assertEquals(-1000D, cuentaCorriente.getBalance(), 0);
    }
}
