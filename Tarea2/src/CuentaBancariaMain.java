public class CuentaBancariaMain {

    public static void main(String[] args) {

        // Crear el objeto CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Lucia", 100.0);

        // Mostrar información inicial
        cuenta.mostrarInformacion();

// Depositar dinero
        cuenta.depositar(50.0);
        cuenta.mostrarInformacion();

        // Retirar dinero
        cuenta.retirar(30.0);
        cuenta.mostrarInformacion();

    }
}