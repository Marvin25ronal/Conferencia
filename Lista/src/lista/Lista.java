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
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona juan=new Persona(25, "juan");
        Persona pedro=new Persona(25, "pedro");
        Persona marta=new Persona(25, "marta");
        Persona maria=new Persona(25, "maria");
        ListaEnlazada lista=new ListaEnlazada();
        lista.insertar(juan);
        lista.insertar(pedro);
        lista.insertar(marta);
        lista.insertar(maria);
        lista.imprimirLista();
        lista.buscar("maria");
    }
    
}
