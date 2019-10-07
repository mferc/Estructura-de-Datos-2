/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero= 10;
        System.out.println("Valor = "+numero);
        incrementar (numero);
        System.out.println("El valor = "+numero);
        //--------------------------------------
        Prueba obj = new Prueba();
        obj.iVal = 10;
        System.out.println("Valor = "+obj.iVal);
        incrementaObj(obj.iVal);
        System.out.println("Valor = "+obj.iVal);
       
    }
    public static void incrementar(int iVal){
        iVal++;
        System.out.println("El valor = "+iVal);
    }
    public static void incrementaObj(int iVal){
        iVal++;
        System.out.println("Valor= "+iVal);
    }
    
}
class Prueba{
        int iVal;
    }