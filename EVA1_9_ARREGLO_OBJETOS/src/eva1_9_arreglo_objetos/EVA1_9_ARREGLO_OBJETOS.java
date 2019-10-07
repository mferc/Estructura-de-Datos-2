//El arreglo es un contenedor
//null.pointer.exception : Tratando de leer un objeto que no existe
package eva1_9_arreglo_objetos;

/**
 *
 * @María Fernanda Cazares Herrera
 */
public class EVA1_9_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Prueba[] apArreglo = new Prueba[5]; //crear un arreglo que va a almacenar 5 objetos de tipo PRUEBA
       Prueba[] aCopia =new Prueba[5];
        
        System.out.println("apARREGLO");
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i] = new Prueba(); //creando objeto tipo prueba
            apArreglo[i].x= (int)(Math.random()*200);
            System.out.println(apArreglo[i]); //imprimir arreglo en la posicion i
            
            
        }
        System.out.println("Duplicado");
            for(int i=0; i < aCopia.length;i++){
                aCopia[i] = new Prueba();
                aCopia[i].x = apArreglo[i].x;
                System.out.println(aCopia[i]);
            }
    }
    
}
class Prueba{
    int x; //Atributo
}