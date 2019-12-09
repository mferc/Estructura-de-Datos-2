
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class EVA2_10_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(new Nodo(100));
        pila.push(new Nodo(200));
        pila.push(new Nodo(300));
        pila.push(new Nodo(400));
        pila.print();
        
        System.out.println("CIMA DE LA PILA "+pila.peek());
        try {
            System.out.println("CIMA DE LA PILA "+pila.pop());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_10_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pila.print();
    }
    
}
