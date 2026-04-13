public class Celular {

    // Atributos private
    private String marca;
    private int bateria;

    // guarda la marca del celular
    public Celular(String marca) {
        this.marca = marca;
    }

    // Mset para asignar el nivel de batería con validación
    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("La batería debe estar entre 0 y 100");
        }
    }

    // mostrar la información del celular
    public void mostrarCelular() {
        System.out.println("Marca: " + marca);
        System.out.println("Nivel de batería: " + bateria + "%");
    }
}