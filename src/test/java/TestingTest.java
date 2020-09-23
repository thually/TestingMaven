import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestingTest {
    public static void main(String[] args) throws IOException, ParseException {
        //I guess this folder is for testing files ans stuff.
        Usuario alejo = new Usuario(123, "Alejo", "Morado");
        String a = "holito";

        JSONObject usuarioDetails = new JSONObject();
        usuarioDetails.put("Nombre", "bla");
        usuarioDetails.put("Objeto", a);
        System.out.println("Imprimiendo usuarioDetails");
        System.out.println(usuarioDetails);
        System.out.println();

        try (FileWriter file = new FileWriter("target/database/usuarios2.json")) {
            file.write(alejo.toJSONObj().toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("target/database/usuarios1.json")) {

            System.out.println("Leyendo usuario1: ");
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);
            System.out.println(jsonObject.get("Nombre"));
            System.out.println();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader("target/database/usuarios2.json")) {

            System.out.println("Leyendo usuario2: ");
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);
            System.out.println(jsonObject.get("usuario"));
            JSONObject usuarioDetails2 = (JSONObject) jsonObject.get("usuario");
            System.out.println("usuarioDetails2: "+ usuarioDetails2);
            System.out.println();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Reader reader = new FileReader("target/database/usuarios2.json");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);
        System.out.println("Pasando de JSON a Java:");
        Usuario javaUsuario = new Usuario(jsonObject);
        System.out.println(javaUsuario);
    }
}
