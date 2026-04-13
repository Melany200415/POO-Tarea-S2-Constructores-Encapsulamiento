public class Libro {
    //Atributo
    String titulo;
    String autor;
    int anioPublicacion;
    //Constructor
    public Libro (String titulo,String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
        // Metodo para mostrar información
        public void mostrarInformacion() {

            System.out.println("Título: "+titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Año de publicación: " + anioPublicacion);
            System.out.println("-----------------------------");
        }
    }

