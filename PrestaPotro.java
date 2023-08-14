package prestapotro;


import java.util.Scanner;
import prestapotro.Lista;

public class PrestaPotro{
    public static void main(String[] args) {
        int op, a;
        Lista obj = new Lista();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1) Insertar componentes");
            System.out.println("2) Mostrar");
            System.out.println("3) Eliminar");
            System.out.println("4) Salir");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingresa componentes:");
                    a = scanner.nextInt();
                    obj.insertar(a);
                    break;
                case 2:
                    obj.imprimir();
                    break;
                case 3:
                    // Implementar la función eliminar si es necesario
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (op != 4);
    }
}
