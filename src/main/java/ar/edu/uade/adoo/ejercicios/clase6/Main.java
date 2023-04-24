package ar.edu.uade.adoo.ejercicios.clase6;

public class Main {
    public static void main(String[] args) {
        Producto moto = new ProductoSingular("Moto", 500000D);
        Producto casco = new ProductoSingular("Casco", 60000D);
        Producto guantes = new ProductoSingular("Guantes", 10000D);
        Producto chaleco = new ProductoSingular("Chaleco", 40000D);
        Producto piloto = new ProductoSingular("Piloto", 50000D);

        Producto comboMotoCasco = new Combo("Moto + Casco");
        comboMotoCasco.agregarProducto(moto);
        comboMotoCasco.agregarProducto(casco);

        System.out.println("Precio de la moto: " + moto.calcularPrecio());
        System.out.println("Precio del combo moto + casco: " + comboMotoCasco.calcularPrecio());

        Producto comboIndumentaria = new Combo("Combo indumentaria");
        comboIndumentaria.agregarProducto(guantes);
        comboIndumentaria.agregarProducto(chaleco);
        comboIndumentaria.agregarProducto(piloto);

        Producto comboMiPrimeraMoto = new Combo("Mi primera moto combo");
        comboMiPrimeraMoto.agregarProducto(comboMotoCasco);
        comboMiPrimeraMoto.agregarProducto(comboIndumentaria);

        System.out.println("Precio de combo mi primera moto: " + comboMiPrimeraMoto.calcularPrecio());

        Producto motoConDescuento = new DescuentoDecorator(moto, 0.1D);
        System.out.println("Precio de la moto con descuento: " + motoConDescuento.calcularPrecio());

        Producto comboMotoConDescuentoYCasco = new Combo("Combo moto con descuento y casco");
        comboMotoConDescuentoYCasco.agregarProducto(casco);
        comboMotoConDescuentoYCasco.agregarProducto(motoConDescuento);
        System.out.println("Precio del combo moto con descuento y casco: " + comboMotoConDescuentoYCasco.calcularPrecio());

        Producto descuentoEstudiante = new DescuentoDecorator(comboMotoConDescuentoYCasco, 0.05D);
        System.out.println("Precio del combo moto con descuento y casco (dto estudiante): " + descuentoEstudiante.calcularPrecio());

        Producto packagingEstudiante = new PackagingDecorator(descuentoEstudiante, 1500D);
        System.out.println("Precio final para estudiantes: " + packagingEstudiante.calcularPrecio());
        System.out.println("Precio moto: " + moto.calcularPrecio());
    }
}
