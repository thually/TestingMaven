import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import org.json.simple.*;

public class HelloMaven {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        System.out.println("Hello word");
        int a, b;
        a = 2;
        b = 3;
        System.out.println(a+b);
        System.out.println("Hice un archivo ejecutable");
        Scanner input = new Scanner(System.in);
        Usuario alejo = new Usuario(123, "Alejo", "Morado");
        lista.add(alejo);
        System.out.print("Ingrese cedula del usuario: ");
        int cedula = input.nextInt();
        System.out.print("Ingrese nombre del usuario: ");
        String nombre = input.next();
        System.out.print("Ingrese color favorito del usuario: ");
        String color = input.next();
        lista.add(new Usuario(cedula, nombre, color));
        System.out.println(lista);

        JSONObject usuarioDetails = new JSONObject();
        usuarioDetails.put("Nombre", "bla");
        usuarioDetails.put("Objeto", alejo);
        System.out.println(usuarioDetails);
    }
}
