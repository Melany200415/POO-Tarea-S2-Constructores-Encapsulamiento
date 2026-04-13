public class Producto {
    String nombre;
    private double precio;
    private int cantidad;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con valores fijos
    public Producto(boolean valoresFijos) {
        nombre = "Lapiz";
        precio = 0.25;
        cantidad = 1;
    }

    // Constructor con parámetros
    public Producto(String nombre, double precio, int cantidad) {

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    //  mostrar datos
    public void muestraDatos() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("-----------------------------");
    }
}