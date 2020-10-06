/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author marvi
 */
public class ListaEnlazada {

    Persona inicial;
    Persona ultimo;

    public ListaEnlazada() {
        inicial = null;
        ultimo = null;
    }

    public void insertar(Persona nueva) {
        if (inicial == null) {
            inicial = nueva;
            ultimo = nueva;
        } else {
            Persona aux = ultimo;
            aux.setSiguient(nueva);
            ultimo = nueva;
        }
    }

    public void imprimirLista() {
        Persona aux = inicial;
        while (aux != null) {
            System.out.print(aux.getNombre());
            System.out.print("-----");
            System.out.println(aux.getEdad());
            aux = aux.getSiguient();
        }

    }

}
