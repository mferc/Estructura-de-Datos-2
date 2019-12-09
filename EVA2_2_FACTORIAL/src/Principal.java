
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
        System.out.println("Ingresa un valor para calcular su factorial");
        int num;
        Scanner numero =new Scanner(System.in);
        num = numero.nextInt();
        System.out.println(calcularFactorial(num));
        
    }
    
    public static int calcularFactorial(int fact){ 
        if(fact==0)
            return 1;
        return fact*calcularFactorial(fact -1); }// regresar el valor ingresdo por el factorial del numero menos 1
        
    }
    

