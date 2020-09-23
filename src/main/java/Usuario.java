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

    public Usuario(JSONObject toJavaObj){
        JSONObject usuario = (JSONObject) toJavaObj.get("usuario");
        Long cedu; cedu = (Long) usuario.get("cedula");
        this.cedula = cedu.intValue();
        this.nombre = (String) usuario.get("nombre");
        this.color = (String) usuario.get("color");
    }

    public JSONObject toJSONObj(){
        JSONObject usuarioDetials = new JSONObject();
        usuarioDetials.put("cedula", cedula);
        usuarioDetials.put("nombre", nombre);
        usuarioDetials.put("color", color);

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
