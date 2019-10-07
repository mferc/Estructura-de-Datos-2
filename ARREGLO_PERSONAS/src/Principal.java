
import java.util.Scanner;


/**
 *
 * @María Fernanda Cázares Herrera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Crear clase persona y crear un arreglo
       Persona[] aPersonas= new Persona[10];
       Scanner sCaptu =new Scanner(System.in);
       for(int i=0; i< aPersonas.length;i++){
           aPersonas[i]= new Persona();
           System.out.println("Introduce tu nombre");
           aPersonas[i].nombre =sCaptu.nextLine();
       }
        imprimeArreglo(aPersonas);
        System.out.println("DATOS DUPLICADOS");
         Persona[] aCopia= new Persona[10];
        for(int i= 0; i<aCopia.length; i++){
            aCopia[i]= new Persona();
            aCopia[i].nombre= aPersonas[i].nombre;
            System.out.println(aCopia[i]);
        }
    }
    public static void imprimeArreglo(Persona[]args){
        for(int i =0; i<args.length;i++){
            System.out.println("nombre: "+args[i].nombre);
        }
        //Copia
       
    }
    
}
class Persona{
    String nombre;
}