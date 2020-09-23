public class Usuario {
    public int cedula;
    public String nombre;
    public String color;

    public Usuario(int cedula, String nombre, String color) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
