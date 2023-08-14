package prestapotro;

import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;

    Nodo(int x) {
        dato = x;
        siguiente = null;
    }
}

class Lista {
    Nodo inicio;
    Nodo fin;

    Lista() {
        inicio = null;
        fin = null;
    }

    void insertar(int x) {
        Nodo nuevo = new Nodo(x);
        if (inicio == null && fin == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            if (x < inicio.dato) {
                nuevo.siguiente = inicio;
                inicio = nuevo;
            } else if (x >= fin.dato) {
                fin.siguiente = nuevo;
                fin = nuevo;
            } else {
                Nodo aux = inicio;
                while (aux.siguiente != null && x >= aux.siguiente.dato) {
                    aux = aux.siguiente;
                }
                nuevo.siguiente = aux.siguiente;
                aux.siguiente = nuevo;
            }
        }
    }

    void imprimir() {
        if (inicio == null && fin == null) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.print(aux.dato + "-");
                aux = aux.siguiente;
            }
            System.out.println();
        }
    }
}

