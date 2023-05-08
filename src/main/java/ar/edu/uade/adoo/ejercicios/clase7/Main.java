package ar.edu.uade.adoo.ejercicios.clase7;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Inmueble inmueble = new Galpon(casa);
        Operacion operacion = new Venta(inmueble);
        Empleado empleado = new Empleado("ana");
        Empleado empleado2 = new Empleado("pepe");

        Cliente cliente = new Cliente("Maria", 123456789);
        Cliente cliente2 = new Cliente("Marta", 123452789);

        operacion.reservar(empleado, cliente);
        operacion.reservar(empleado, cliente);
        operacion.concretar(empleado2, cliente2);
    }

    // Dentro de un controller
    public void disponibilizarInmueble(Inmueble inmueble, String tipoOperacion) {
        if (inmueble instanceof Local) {
            if (!tipoOperacion.equals("Venta")) {
                new Alquiler(inmueble);
            }
            //Mostrar error por pantalla: no puedo vender locales
        } else  {
            // Lo que quieras
        }

    }
}
