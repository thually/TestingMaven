import org.json.simple.JSONArray;

import java.util.Scanner;

public class HelloMaven {
    public static void main(String[] args) {
        System.out.println("Hello word");
        int a, b;
        a = 2;
        b = 3;
        System.out.println(a+b);
        System.out.println("Hice un archivo ejecutable");
        Scanner input = new Scanner(System.in);
        String linea = input.nextLine();
        System.out.println(linea);
    }
}
