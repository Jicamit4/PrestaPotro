package prestapotro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCaracteres {
    public static void main(String[] args) {
        List<Character> listaCaracteres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {
            System.out.println("Lista actual: " + listaCaracteres);
            System.out.print("Agregar un carácter (s para salir): ");
            opcion = scanner.nextLine().charAt(0);

            if (opcion != 's') {
                listaCaracteres.add(opcion);
            }
        } while (opcion != 's');

        System.out.println("Lista final: " + listaCaracteres);
    }
}
Este código crea una lista dinámica utilizando ArrayList y permite al usuario agregar caracteres a la lista. El ciclo do-while continúa hasta que el usuario ingrese 's' para salir. Ten en cuenta que este es solo un ejemplo básico y podrías adaptarlo según tus necesidades.




User
creame un lista enlazada  donde se puedan agregar caracteres en java dame la clase y main
ChatGPT
Claro, aquí tienes un ejemplo de cómo crear una lista enlazada en Java para almacenar caracteres. Utilizaremos la clase LinkedList de la biblioteca estándar para implementar la lista enlazada:

java
Copy code
import java.util.LinkedList;
import java.util.Scanner;

public class ListaEnlazadaCaracteres {
    public static void main(String[] args) {
        LinkedList<Character> listaEnlazada = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {
            System.out.println("Lista actual: " + listaEnlazada);
            System.out.print("Agregar un carácter (s para salir): ");
            opcion = scanner.nextLine().charAt(0);

            if (opcion != 's') {
                listaEnlazada.add(opcion);
            }
        } while (opcion != 's');

        System.out.println("Lista final: " + listaEnlazada);
    }
}