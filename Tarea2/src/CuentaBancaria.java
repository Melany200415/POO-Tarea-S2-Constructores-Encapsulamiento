public class CuentaBancaria {

    // Atributos private
    private String nombreTitular;
    private double saldo;

    // Constructor public
    public CuentaBancaria(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    //  mostrar información
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("----------------------------");
    }

    // depositar dinero
    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Depósito realizado: $" + monto);
    }

    // retirar dinero
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro realizado: $" + monto);
        } else {
            System.out.println("Saldo insuficiente $" + monto);
        }
    }
}