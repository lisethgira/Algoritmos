import java.util.Scanner;

public class Pemberty {
    public static void main (String[] args) {
        Scanner Input = new Scanner(System.in);
        int tipo_necesidad = Input.nextLn();
        String genero = "mujer";

        System.out.println("Abrir los ojos");
        System.out.println("Sentarse en la cama");
        System.out.println("Caminar al baño");
        hacer_necesidades(tipo_necesidad, genero);
        System.out.println("Salir para el Trabajo");
    }

    static void hacer_necesidades (int tipo_necesidad, String genero) {
        System.out.println("Entrar al baño");
        System.out.println("Bajarse interiores");
        if (tipo_necesidad == 1) {
            if (genero.equals("mujer")) {
                System.out.println("Sentarse en taza");
            } else{
                System.out.println("Hacerse en frente");
            }
        } else if (tipo_necesidad == 2) {
            System.out.println("Sentarse en taza");
        } else {
            System.out.println("Eres un mutante");
        }
        System.out.println("Hacer necesidad");
        System.out.println("Limpiarse");
        System.out.println("Poner interiores");
        System.out.println("Vaciar");
        System.out.println("Lavarse");
        System.out.println("Salir del Baño");
    }
}

