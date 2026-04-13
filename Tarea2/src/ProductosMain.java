public class ProductosMain {
    public static void main(String[] args) {

        // Constructor vacío
        Producto producto1 = new Producto();

        // Constructor con valores fijos
        Producto producto2 = new Producto(true);

        // Constructor con parámetros
        Producto producto3 = new Producto("Borrador", 0.75, 2);

        //  mostrar datos
        producto1.muestraDatos();
        producto2.muestraDatos();
        producto3.muestraDatos();
    }
}