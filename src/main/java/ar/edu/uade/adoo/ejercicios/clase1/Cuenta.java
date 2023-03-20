package ar.edu.uade.adoo.ejercicios.clase1;

public abstract class Cuenta {
    private Cliente cliente;
    private Double balance;
    private Integer numeroCuenta;

    public Cuenta(Cliente cliente, Double balance, Integer numeroCuenta) {
        this.cliente = cliente;
        this.balance = balance;
        this.numeroCuenta = numeroCuenta;
    }

    public void extraer(Double monto) {
        this.balance -= monto;
    }

    public void depositar(Double monto) {
        this.balance += monto;
    }

    public Double getBalance() {
        return this.balance;
    }
}
