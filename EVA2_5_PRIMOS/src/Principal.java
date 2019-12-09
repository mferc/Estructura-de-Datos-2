
import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
        int no;
        System.out.println("Ingresa un número");
        Scanner s = new Scanner(System.in);
        no =s.nextInt();
        if(esPrimoIneficiente(no))
            System.out.println("Es primo");
            else
        System.out.println("No es primo");
        
        
            
        }
    public static boolean esPrimoIneficiente(int numerito){
        boolean bResu = false;
        for (int i = 2; i < numerito; i++) {
            if((numerito%i)==0){
                bResu =false;
                break;
             }
        }
        return bResu;
     
    }
    
}
