import org.json.simple.JSONObject;

public class Usuario {
    public int cedula;
    public String nombre;
    public String color;

    public Usuario(int cedula, String nombre, String color) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.color = color;
    }

    public JSONObject toJSONObj(){
        JSONObject usuarioDetials = new JSONObject();
        usuarioDetials.put("Cedula", cedula);
        usuarioDetials.put("Nombre", nombre);
        usuarioDetials.put("Color", color);

        JSONObject usuarioObj = new JSONObject();
        usuarioObj.put("usuario", usuarioDetials);

        return usuarioObj;

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
