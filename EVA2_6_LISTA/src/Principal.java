/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @María Fernanda Cazares Herrera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo obj =new Nodo(); //apunta a un nuevo nodo
        obj.ola = 100;
        obj.hey = new Nodo(); //apunta a un nuevo modo
        obj.hey.ola = 200;
        obj.hey.hey =new Nodo (); //apunta a un nuevo nodo
        obj.hey.hey.ola = 300; 
        System.out.println(obj.ola);
        System.out.println(obj.hey.ola);
        System.out.println(obj.hey.hey.ola);
    }
    
}
//NODOS
class Nodo{
    //Dato a almacenar
    int ola;
    Nodo hey;
}
