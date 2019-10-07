//@María Fernanda Cázares Herrera
import java.util.Scanner;


public class principal {

    public static void main(String[] args) {
       Persona[] aPersona= new Persona[5]; //arreglo tamaño 5
       Scanner d= new Scanner(System.in); //scanner para que el usuario introduzca el nombre
        for (int i = 0; i < aPersona.length; i++) {
            aPersona[i]= new Persona();
            System.out.println("¿Cuál es tu nombre?");
            aPersona[i].nombre = d.nextLine(); //nextLine es para dar enter 
        }
        imprimirArreglo(aPersona);
        //COPIA DEL ARREGLO
        Persona[] aCopias = new Persona[aPersona.length];
        for (int i = 0; i < aCopias.length; i++) {
            aCopias[i] = new Persona();
            aCopias[i].nombre = aPersona[i].nombre;
            
        }
    }
    public static void imprimirArreglo(Persona[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("nombre: "+ args[i].nombre);
        }
    }
}
class Persona{
String nombre;
}
