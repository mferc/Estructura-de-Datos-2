
import java.util.Scanner;

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
        System.out.println("Ingresa un número");
        Scanner iNum = new Scanner(System.in);
        int numero = iNum.nextInt();
        for (int i = numero; i >=1; i--) { // mientras i = numero y sea mayor o igual a 1, se va a disminuir 1
            System.out.print(i+"-");
            
        }
        System.out.println("");
        forFalso(numero);
         
        System.out.println("");
        noSe(numero,1);
        
    }
    public static void forFalso(int iVal){
        System.out.print(iVal+"-");
        if(iVal > 1)
        forFalso(iVal-1);
        
    }
    public static void noSe(int num, int inc){
        System.out.print(inc+"-");
        if(inc<num)
            noSe(num, inc +1);
    }
    
}
