public class Usuarios {

    //  Atributos private
    private String usuarios;
    private String contraseña;

    // Constructor utilizando el nombre el usuario
    public Usuarios(String usuario) {
        this.usuarios = usuario;
    }

    // Metodo set para la contraseña
    public void setContraseña(String contraseña) {
        if (contraseña.length() >= 6) { // evita contraseñás cortas o inseguras
            this.contraseña = contraseña;
        } else {
            System.out.println("La contraseña no contiene 4 caracteres");
        }
    }
    //mostrar el usuario
    public void mostrarUsuario() {
        System.out.println("Usuario: " + usuarios);
    }
}